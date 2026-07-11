package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_09_04_DesignHashSet {

    /**
     * Drill 4/5 for Easy_09_DesignHashSet — Resizable HashSet (Dynamic Rehashing)
     * Technique: extends the fixed-size bucket array of Easy_09_DesignHashSet with dynamic
     * resizing — when the load factor (size / bucketCount) exceeds a threshold (e.g. 0.75),
     * allocate a bigger bucket array and re-insert every existing key into its new bucket.
     *
     * Design a ResizableHashSet without built-in hash table libraries that supports:
     * - void add(key): inserts key if not already present. If, after insertion, the load
     *   factor exceeds 0.75, double the number of buckets and rehash every key into the new
     *   array.
     * - void remove(key): removes key if present; no-op otherwise.
     * - boolean contains(key): returns whether key exists.
     */
    static class ResizableHashSet {
        // TODO: Define your buckets array here (Separate Chaining), plus resize/rehash logic.

        public ResizableHashSet() {

        }

        public void add(int key) {
            // TODO: Implement, including load-factor check and rehash when needed.
        }

        public void remove(int key) {
            // TODO: Implement
        }

        public boolean contains(int key) {
            // TODO: Implement
            return false;
        }
    }
}
