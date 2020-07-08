package halfsynchalfasync.design.pattern.example;

public class NonBlockingDispatcher {

    private boolean result = false;

    private WorkQueue queue;

    private ResultSubscriber subscriber;

    public NonBlockingDispatcher(ResultSubscriber subscriber) {
        queue = new WorkQueue(this);
        this.subscriber = subscriber;
    }

    /**
     * Sends a request to the queue and returns instantly.
     *
     * @param imgPath   Image path for the ASCII generator
     * @param outPath   Output path for the ASCII generator
     */
    public void dispatch(final String imgPath, final String outPath) {
        Runnable submission = new Runnable() {
            @Override
            public void run() {
                queue.submit(imgPath, outPath);
            }
        };
        new Thread(submission).start();
    }

    /**
     * Captures processing result and notifies the subscribed client
     *
     * @param result true, if success, false otherwise
     */
    public void onResult(boolean result) {
        if (subscriber != null) {
            subscriber.onResult(result);
        }
    }
}
