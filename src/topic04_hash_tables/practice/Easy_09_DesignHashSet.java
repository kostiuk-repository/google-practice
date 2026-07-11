package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_09_DesignHashSet {

    /**
     * Problem: Design HashSet
     * 
     * Design a HashSet without using any built-in hash table libraries.
     * 
     * Implement MyHashSet class:
     * - void add(key) Inserts the value key into the HashSet.
     * - boolean contains(key) Returns whether the value key exists in the HashSet or not.
     * - void remove(key) Removes the value key in the HashSet. If key does not exist, do nothing.
     */
    static class MyHashSet {
        // TODO: Define your buckets array here (Separate Chaining).

        public MyHashSet() {
            
        }
        
        public void add(int key) {
            // TODO: Implement
        }
        
        public void remove(int key) {
            // TODO: Implement
        }
        
        public boolean contains(int key) {
            // TODO: Implement
            return false;
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
     * Mentor Question: Separate chaining resolves collisions by storing elements in a linked list 
     * at each array index. 
     * 1. How do you design your hash function to map integer keys to bucket indices?
     * 2. Why is choosing a prime number (like 769 or 1009) as the number of buckets preferred over powers of 2?
     * 
     * Your Answer: 
     * 
     */
}
