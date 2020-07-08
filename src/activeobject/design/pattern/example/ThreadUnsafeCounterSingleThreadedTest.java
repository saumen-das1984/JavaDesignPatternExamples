package activeobject.design.pattern.example;

import org.junit.Before;
import org.junit.Test;
import activeobject.design.pattern.example.Counter;
import activeobject.design.pattern.example.ThreadUnsafeCounter;

import static org.junit.Assert.assertEquals;

public class ThreadUnsafeCounterSingleThreadedTest {

    // The value the counter is initialized with
    public static final long INITIAL_VALUE = 10L;

    private Counter counter;

    @Before
    public void init() {
        counter = new ThreadUnsafeCounter(INITIAL_VALUE);
    }

    @Test
    public void get() {
        assertEquals(INITIAL_VALUE, counter.get());
    }

    @Test
    public void incrementAndGet() {
        final long expected = INITIAL_VALUE + 1;
        assertEquals(expected, counter.incrementAndGet());
        assertEquals(expected, counter.get());
    };

    @Test
    public void getAndIncrement() {
        assertEquals(INITIAL_VALUE, counter.getAndIncrement());
        assertEquals(INITIAL_VALUE + 1, counter.get());
    };

    @Test
    public void decrementAndGet() {
        final long expected = INITIAL_VALUE - 1;
        assertEquals(expected, counter.decrementAndGet());
        assertEquals(expected, counter.get());
    };

    @Test
    public void getAndDecrement() {
        assertEquals(INITIAL_VALUE, counter.getAndDecrement());
        assertEquals(INITIAL_VALUE - 1, counter.get());
    };
}
