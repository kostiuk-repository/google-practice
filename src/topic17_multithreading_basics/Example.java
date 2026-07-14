package topic17_multithreading_basics;

/**
 * Example: Thread-safe counter using Synchronized and Volatile.
 */
public class Example {
    private volatile int count = 0;

    // Mutex lock on the current instance
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
