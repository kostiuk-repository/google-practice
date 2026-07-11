package topic04_hash_tables.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Easy_10_03_DesignHashMap {

    /**
     * Drill 3/5 for Easy_10_DesignHashMap — HashMap With containsKey and keySet
     * Technique: same bucket-array + key-value node design as Easy_10_DesignHashMap, but adds
     * methods that must traverse EVERY bucket to aggregate information across the whole map
     * (collect all keys), instead of only computing one bucket's index.
     *
     * Design a MyHashMap without built-in hash table libraries that supports:
     * - void put(int key, int value): inserts the pair, or updates the value if key exists.
     * - int get(int key): returns the mapped value, or -1 if key is not present.
     * - void remove(int key): removes the key and its value if present.
     * - boolean containsKey(int key): returns whether key is present.
     * - List<Integer> keySet(): returns a list of all keys currently stored, in any order.
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
            return -1;
        }

        public void remove(int key) {
            // TODO: Implement
        }

        public boolean containsKey(int key) {
            // TODO: Implement
            return false;
        }

        public List<Integer> keySet() {
            // TODO: Implement
            return new ArrayList<>();
        }
    }
}
