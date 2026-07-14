package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_09_05_DesignHashSet {

    /**
     * Drill 5/5 for Easy_09_DesignHashSet — HashSet Intersection
     * Technique: capstone — extends the bucket-array + separate-chaining design of
     * Easy_09_DesignHashSet with a set-algebra operation: iterate every bucket of one set,
     * checking each stored key against the other set's contains(), building a third HashSet of
     * the common keys.
     *
     * Design a MyHashSet without built-in hash table libraries that supports:
     * - void add(key): inserts key if not already present.
     * - void remove(key): removes key if present; no-op otherwise.
     * - boolean contains(key): returns whether key exists.
     * - MyHashSet intersect(MyHashSet other): returns a NEW MyHashSet containing only the keys
     *   present in both this set and other, by iterating this set's buckets and checking
     *   other.contains(key) for each stored key.
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

        public MyHashSet intersect(MyHashSet other) {
            // TODO: Implement
            return null;
        }
    }
}
