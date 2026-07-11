package topic03_stacks_queues.practice;

import java.util.*;

public class Medium_04_05_DesignCircularQueue {

    /**
     * Drill 5/5 for Medium_04_DesignCircularQueue — Expiring Circular Queue
     * Technique: queue elements with expiry (TTL).
     */
    static class ExpiringCircularQueue {
        // TODO: Define members.

        public ExpiringCircularQueue(int k) {
            
        }
        
        public boolean enQueue(int value, long ttlMs) {
            return false;
        }
        
        public boolean deQueue() {
            return false;
        }
        
        public int Front() {
            return -1;
        }
        
        public boolean isEmpty() {
            return true;
        }
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
     * Mentor Question: How do we clean up expired elements from the front of the queue lazily when calling Front() or deQueue()?
     * 
     * Your Answer: 
     * 
     */
}
