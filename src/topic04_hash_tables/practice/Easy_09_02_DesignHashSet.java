package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_09_02_DesignHashSet {

    /**
     * Drill 2/5 for Easy_09_DesignHashSet — String-Keyed HashSet
     * Technique: generalizes the key type of Easy_09_DesignHashSet from int to String — the
     * same bucket-array + separate-chaining shape applies, but now the hash function must
     * combine a String's characters (e.g. polynomial rolling hash) into a bucket index instead
     * of using the key's value directly.
     *
     * Design a StringHashSet without built-in hash table libraries that supports:
     * - void add(String key): inserts key if not already present.
     * - void remove(String key): removes key if present; no-op otherwise.
     * - boolean contains(String key): returns whether key exists.
     */
    static class StringHashSet {
        // TODO: Define your buckets array and a custom String hash function here.

        public StringHashSet() {

        }

        public void add(String key) {
            // TODO: Implement
        }

        public void remove(String key) {
            // TODO: Implement
        }

        public boolean contains(String key) {
            // TODO: Implement
            return false;
        }
    }
}
