package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_09_01_DesignHashSet {

    /**
     * Drill 1/5 for Easy_09_DesignHashSet — Insert-Only Mini HashSet
     * Technique: isolates the bucket-array + separate-chaining insert/lookup core of
     * Easy_09_DesignHashSet, dropping remove() entirely so you can focus purely on hashing a
     * key to a bucket index and scanning that bucket's list for membership.
     *
     * Design a MiniHashSet without built-in hash table libraries that supports:
     * - void add(key): inserts key if not already present (adding an existing key is a no-op).
     * - boolean contains(key): returns whether key exists.
     * There is no remove() method in this drill.
     */
    static class MiniHashSet {
        // TODO: Define your buckets array here (Separate Chaining).

        public MiniHashSet() {

        }

        public void add(int key) {
            // TODO: Implement
        }

        public boolean contains(int key) {
            // TODO: Implement
            return false;
        }
    }
}
