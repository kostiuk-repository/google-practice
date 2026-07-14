package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_10_05_DesignHashMap {

    /**
     * Drill 5/5 for Easy_10_DesignHashMap — HashMap With Atomic Increment
     * Technique: capstone — extends the key-value-node update-in-place logic of
     * Easy_10_DesignHashMap (the part that finds an existing node and overwrites its value)
     * into an atomic read-modify-write operation, the same pattern used everywhere frequency
     * counting appears in this topic.
     *
     * Design a MyHashMap without built-in hash table libraries that supports:
     * - void put(int key, int value): inserts the pair, or updates the value if key exists.
     * - int get(int key): returns the mapped value, or -1 if key is not present.
     * - void remove(int key): removes the key and its value if present.
     * - void incrementOrInsert(int key, int delta): if key exists, adds delta to its current
     *   value in place; if key does not exist, inserts it with value = delta. This must be a
     *   single bucket traversal, not a separate get() followed by put().
     */
    static class MyHashMap {
        // TODO: Define key-value pair node and bucket array (Separate Chaining).

        public MyHashMap() {

        }

        public void put(int key, int value) {
            // TODO: Implement
        }

        public int get(int key) {
            // TODO: Implement
            return 0;
        }

        public void remove(int key) {
            // TODO: Implement
        }

        public void incrementOrInsert(int key, int delta) {
            // TODO: Implement
        }
    }
}
