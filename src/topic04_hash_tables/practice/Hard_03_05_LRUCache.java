package topic04_hash_tables.practice;

import java.util.*;

public class Hard_03_05_LRUCache {

    /**
     * Drill 5/5 for Hard_03_LRUCache — LFU Cache (Least Frequently Used)
     * Technique: nested doubly linked lists or frequency map
     *
     * Implement an LFU Cache with get(key) and put(key, value) in O(1) time.
     */
    public static class LFUCache {
        // TODO: Define structures (e.g. key-to-val, key-to-freq, freq-to-keys/lists, minFreq)
        
        public LFUCache(int capacity) {
            
        }
        
        public int get(int key) {
            // TODO: Implement
            return 0;
        }
        
        public void put(int key, int value) {
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
     * Mentor Question: LFU requires tracking frequency. Why is it not enough to just use 
     * a single Doubly Linked List? How does using a map from frequency to a LinkedHashSet 
     * (or another DLL) help solve LFU in O(1) time?
     * 
     * Your Answer: 
     * 
     */
}
