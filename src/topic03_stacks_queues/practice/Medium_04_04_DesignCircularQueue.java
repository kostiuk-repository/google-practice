package topic03_stacks_queues.practice;

import java.util.*;

public class Medium_04_04_DesignCircularQueue {

    /**
     * Drill 4/5 for Medium_04_DesignCircularQueue — Circular Queue using Linked List
     * Technique: queue via circular singly linked list.
     */
    static class LinkedCircularQueue {
        // TODO: Define members.

        public LinkedCircularQueue(int k) {
            
        }
        
        public boolean enQueue(int value) {
            return false;
        }
        
        public boolean deQueue() {
            return false;
        }
        
        public int Front() {
            return -1;
        }
        
        public int Rear() {
            return -1;
        }
        
        public boolean isEmpty() {
            return true;
        }
        
        public boolean isFull() {
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
     * Mentor Question: How does using a singly-linked list with a single pointer to tail (which points to head via tail.next) simplify the queue implementation?
     * 
     * Your Answer: 
     * 
     */
}
