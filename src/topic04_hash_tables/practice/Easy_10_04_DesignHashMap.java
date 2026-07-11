package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_10_04_DesignHashMap {

    /**
     * Drill 4/5 for Easy_10_DesignHashMap — String-Keyed, String-Valued HashMap
     * Technique: generalizes both the key AND value types of Easy_10_DesignHashMap from int to
     * String — the same bucket-array + key-value-pair-node shape applies, but the hash
     * function must now combine a String's characters into a bucket index.
     *
     * Design a StringHashMap without built-in hash table libraries that supports:
     * - void put(String key, String value): inserts the pair, or updates the value if the key
     *   already exists.
     * - String get(String key): returns the mapped value, or null if key is not present.
     * - void remove(String key): removes the key and its value if present.
     */
    static class StringHashMap {
        // TODO: Define key-value pair node, bucket array, and a custom String hash function.

        public StringHashMap() {

        }

        public void put(String key, String value) {
            // TODO: Implement
        }

        public String get(String key) {
            // TODO: Implement
            return null;
        }

        public void remove(String key) {
            // TODO: Implement
        }
    }
}
