package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_10_01_DesignHashMap {

    /**
     * Drill 1/5 for Easy_10_DesignHashMap — Insert/Lookup-Only Mini HashMap
     * Technique: isolates the bucket-array + key-value-pair-node core of Easy_10_DesignHashMap,
     * dropping remove() so you can focus on inserting a pair, updating in place when the key
     * already exists, and looking it up.
     *
     * Design a MiniHashMap without built-in hash table libraries that supports:
     * - void put(int key, int value): inserts the pair, or updates the value if key exists.
     * - int get(int key): returns the mapped value, or -1 if key is not present.
     * There is no remove() method in this drill.
     */
    static class MiniHashMap {
        // TODO: Define key-value pair node and bucket array (Separate Chaining).

        public MiniHashMap() {

        }

        public void put(int key, int value) {
            // TODO: Implement
        }

        public int get(int key) {
            // TODO: Implement
            return -1;
        }
    }
}
