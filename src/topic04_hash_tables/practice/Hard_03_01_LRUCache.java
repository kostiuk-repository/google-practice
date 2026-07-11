package topic04_hash_tables.practice;

import java.util.*;

public class Hard_03_01_LRUCache {

    public static class Node {
        public int key, val;
        public Node prev, next;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Drill 1/5 for Hard_03_LRUCache — Design Node and Doubly Linked List
     * Technique: pointers manipulation
     *
     * Implement a DoublyLinkedList class with sentinel head and tail nodes 
     * that supports addToHead(node) and removeNode(node) in O(1) time.
     */
    public static class DoublyLinkedList {
        public Node head, tail;
        
        public DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }
        
        public void addToHead(Node node) {
            // TODO: Implement
        }
        
        public void removeNode(Node node) {
            // TODO: Implement
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
     * Mentor Question: Why do we use sentinel (dummy) head and tail nodes in the 
     * Doubly Linked List? How does it simplify pointer updates during insert and delete?
     * 
     * Your Answer: 
     * 
     */
}
