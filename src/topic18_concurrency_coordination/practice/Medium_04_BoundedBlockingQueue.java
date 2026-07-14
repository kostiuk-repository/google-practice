package topic18_concurrency_coordination.practice;

public class Medium_04_BoundedBlockingQueue {

    /**
     * Problem: BoundedBlockingQueue
     *
     * Design a Bounded Blocking Queue that blocks enqueue when full, and blocks dequeue when empty, without standard queue helper collections.
     */
    public void enqueue(int element) throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int dequeue() throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int size() {
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
     * Mentor Question: Explain why using two Conditions (notFull and notEmpty) is more performant than a single synchronized monitor.
     * 
     * Your Answer: 
     * 
     */
}
