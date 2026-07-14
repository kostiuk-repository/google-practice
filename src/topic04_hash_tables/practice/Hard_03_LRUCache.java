package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Hard_03_LRUCache {

    /**
     * Problem: LRU Cache
     * 
     * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
     * 
     * Implement the LRUCache class:
     * - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
     * - int get(int key) Return the value of the key if the key exists, otherwise return -1.
     * - void put(int key, int value) Update the value of the key if the key exists. Otherwise, 
     *   add the key-value pair to the cache. If the number of keys exceeds the capacity from 
     *   this operation, evict the least recently used key.
     * 
     * Constraint: The functions get and put must each run in O(1) average time complexity.
     */
    static class LRUCache {
        // TODO: Define Node structure, Double Linked List pointers, HashMap, and capacity.

        public LRUCache(int capacity) {
            
        }
        
        public int get(int key) {
            // TODO: Implement in O(1)
            return 0;
        }
        
        public void put(int key, int value) {
            // TODO: Implement in O(1)
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
     * Mentor Question: To achieve O(1) time for both lookup and eviction/updates, we combine 
     * a HashMap (for O(1) key-to-node lookup) and a custom Doubly Linked List (for O(1) deletion 
     * and insertion at the head/tail).
     * 
     * 1. Why is a *Doubly* Linked List required here instead of a *Singly* Linked List?
     * 2. When a key is requested via `get(key)`, how does the cache structure update itself 
     *    to mark this key as "recently used"?
     * 
     * Your Answer: 
     * 
     */
}
