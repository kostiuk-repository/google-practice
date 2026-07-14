package topic17_multithreading_basics.practice;

public class Easy_01_PrintInOrder {

    /**
     * Problem: PrintInOrder
     *
     * Suppose we have a class PrintInOrder. Three threads will receive different tasks.
Thread A will call first(), Thread B will call second(), and Thread C will call third().
Design a mechanism to guarantee that first() is executed first, second() is executed second, and third() is executed third.
     */
    public void first(Runnable printFirst) throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void third(Runnable printThird) throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }


    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: Why does busy-spinning on a volatile variable consume high CPU resources, and under what specific conditions is busy-spinning actually preferred over thread blocking?
     * 
     * Your Answer: 
     * 
     */
}
