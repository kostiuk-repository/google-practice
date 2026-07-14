package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_10_02_DesignHashMap {

    /**
     * Drill 2/5 for Easy_10_DesignHashMap — HashMap With getOrDefault
     * Technique: same bucket-array + key-value node lookup as Easy_10_DesignHashMap, but adds
     * a getOrDefault method that parameterizes what to return on a miss instead of the fixed
     * value -1.
     *
     * Design a MyHashMap without built-in hash table libraries that supports:
     * - void put(int key, int value): inserts the pair, or updates the value if key exists.
     * - int get(int key): returns the mapped value, or -1 if key is not present.
     * - void remove(int key): removes the key and its value if present.
     * - int getOrDefault(int key, int defaultValue): returns the mapped value, or
     *   defaultValue if key is not present.
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

        public int getOrDefault(int key, int defaultValue) {
            // TODO: Implement
            return 0;
        }
    }
}
