package topic04_hash_tables.practice;

import java.util.*;

public class Hard_03_03_LRUCache {

    /**
     * Drill 3/5 for Hard_03_LRUCache — Eviction Policy Simulation using LinkedHashMap
     * Technique: LinkedHashMap utility
     *
     * Implement a SimpleLRUCache using Java's built-in LinkedHashMap.
     */
    public static class SimpleLRUCache {
        private final int capacity;
        private final LinkedHashMap<Integer, Integer> map;
        
        public SimpleLRUCache(int capacity) {
            this.capacity = capacity;
            // TODO: Initialize LinkedHashMap with accessOrder=true and override removeEldestEntry
            this.map = new LinkedHashMap<>();
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
     * Mentor Question: Explain the significance of the accessOrder constructor parameter 
     * in Java's LinkedHashMap. What happens when it is set to true versus false?
     * 
     * Your Answer: 
     * 
     */
}
