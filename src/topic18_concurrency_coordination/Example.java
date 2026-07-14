package topic18_concurrency_coordination;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Example: Producer-Consumer using Locks and Conditions.
 */
public class Example {
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    private final int[] buffer = new int[5];
    private int count = 0, putPtr = 0, takePtr = 0;

    public void put(int val) throws InterruptedException {
        lock.lock();
        try {
            while (count == buffer.length) {
                notFull.await(); // Wait for space
            }
            buffer[putPtr] = val;
            putPtr = (putPtr + 1) % buffer.length;
            count++;
            notEmpty.signal(); // Notify consumer
        } finally {
            lock.unlock();
        }
    }

    public int take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await(); // Wait for elements
            }
            int val = buffer[takePtr];
            takePtr = (takePtr + 1) % buffer.length;
            count--;
            notFull.signal(); // Notify producer
            return val;
        } finally {
            lock.unlock();
        }
    }
}
