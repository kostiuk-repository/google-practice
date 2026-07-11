package topic04_hash_tables.practice;

import java.util.*;

public class Hard_03_04_LRUCache {

    public static class Node {
        public int key, val;
        public Node prev, next;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Drill 4/5 for Hard_03_LRUCache — LRU Cache Move to Head
     * Technique: pointer rearrangement
     *
     * Implement the moveToHead method that detaches an existing node from 
     * its current position in the Doubly Linked List and inserts it at the head.
     */
    public static class CacheMover {
        public Node head, tail;
        
        public CacheMover() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }
        
        public void moveToHead(Node node) {
            // TODO: Implement (node already exists in the list, relocate it to the front)
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
     * Mentor Question: Write down the step-by-step pointer operations needed to 
     * remove a node from the middle of the list and place it after the sentinel head.
     * 
     * Your Answer: 
     * 
     */
}
