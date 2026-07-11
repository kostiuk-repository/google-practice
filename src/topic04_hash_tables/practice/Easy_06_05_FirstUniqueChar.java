package topic04_hash_tables.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Easy_06_05_FirstUniqueChar {

    /**
     * Drill 5/5 for Easy_06_FirstUniqueChar — Streaming First Unique Character
     * Technique: capstone — the two-pass frequency map from Easy_06_FirstUniqueChar does not
     * work on a live stream where characters arrive one at a time. Using a LinkedHashMap (which
     * preserves insertion order) as a frequency map, you can maintain "the first character
     * with frequency 1" incrementally: append new characters, bump their count, and evict
     * characters from the front once their count exceeds 1.
     *
     * Design a class that supports:
     * - void add(char c): appends a new character to the stream.
     * - char firstUnique(): returns the first character in the stream so far that has appeared
     *   exactly once, or '\0' if none exists.
     * Both operations should run in O(1) amortized time.
     */
    public static class FirstUniqueCharStream {
        // TODO: Define your LinkedHashMap<Character, Integer> (or equivalent) here.

        public FirstUniqueCharStream() {

        }

        public void add(char c) {
            // TODO: Implement
        }

        public char firstUnique() {
            // TODO: Implement
            return '\0';
        }
    }
}
