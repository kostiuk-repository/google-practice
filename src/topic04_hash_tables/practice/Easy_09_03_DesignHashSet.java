package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_09_03_DesignHashSet {

    /**
     * Drill 3/5 for Easy_09_DesignHashSet — HashSet With Size Tracking
     * Technique: same bucket-array + separate-chaining design as Easy_09_DesignHashSet, but
     * adds a size() method that must reflect the total number of stored keys — either
     * maintained incrementally on add/remove, or computed by summing every bucket's length.
     *
     * Design a MyHashSet without built-in hash table libraries that supports:
     * - void add(key): inserts key if not already present.
     * - void remove(key): removes key if present; no-op otherwise.
     * - boolean contains(key): returns whether key exists.
     * - int size(): returns the current total number of distinct keys stored.
     */
    static class MyHashSet {
        // TODO: Define your buckets array here (Separate Chaining), plus a way to track size.

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

        public int size() {
            // TODO: Implement
            return 0;
        }
    }
}
