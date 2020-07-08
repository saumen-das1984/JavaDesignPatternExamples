package activeobject.design.pattern.example;

import java.util.concurrent.*;

public class ThreadSafeCounter implements Counter {

    // The internal state, subject to race conditions.
    private long value;

    // Activation List: incoming requests (tasks) are put into a queue
    private BlockingQueue<Callable<Long>> taskQueue = new LinkedBlockingQueue<>();

    // Callback: provides access to the calculated results (incrementAndGet, etc.)
    private BlockingQueue<Long> resultQueue = new LinkedBlockingQueue<>();

    // Scheduler: a dedicated thread created and started when the counter gets instantiated
    public ThreadSafeCounter(long value) {
        this.value = value;

        new Thread(new Runnable() {
            @Override
            public void run() {
                // This is the actual task scheduler. It only allows for a single task at a time.
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                try {
                    // busy waiting
                    while (true) {
                        try {
                            // At some point in the future the counter's new value will be available
                            Future<Long> future = executorService.submit(taskQueue.take());
                            while (!future.isDone())
                                ; // wait until the results are ready
                            resultQueue.put(future.get());
                        } catch (InterruptedException | ExecutionException  e) {
                            throw new RuntimeException("Task execution was failed!");
                        }
                    }
                }
                finally {
                    executorService.shutdown();
                }
            }
        }).start();
    }

    @Override
    public long get() {
        return enqueueTask(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return value;
            }
        });
    }

    @Override
    public long incrementAndGet() {
        return enqueueTask(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return ++value;
            }
        });
    }

    @Override
    public long getAndIncrement() {
        return enqueueTask(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return value++;
            }
        });
    }

    @Override
    public long decrementAndGet() {
        return enqueueTask(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return --value;
            }
        });
    }

    @Override
    public long getAndDecrement() {
        return enqueueTask(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return value--;
            }
        });
    }

    // Proxy: allows the clients to submit new tasks
    private long enqueueTask(Callable<Long> task) {
        Long result;
        try {
            // Put the task into the queue
            taskQueue.put(task);

            // Meanwhile, the client is blocked until the result is ready
            while (true) {
                result = resultQueue.poll(500, TimeUnit.MILLISECONDS);
                if (result != null) break;
            }
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException("Task scheduling was interrupted!");
        }
    }
}
