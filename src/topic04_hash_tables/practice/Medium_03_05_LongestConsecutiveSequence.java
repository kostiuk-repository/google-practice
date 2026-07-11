package topic04_hash_tables.practice;

import java.util.*;

public class Medium_03_05_LongestConsecutiveSequence {

    /**
     * Drill 5/5 for Medium_03_LongestConsecutiveSequence — Consecutive Tracker
     * Technique: union-find or hash map boundaries
     *
     * Implement a class ConsecutiveTracker that supports:
     * - void add(int num) : Adds a number to the tracker.
     * - int getLongest() : Returns the length of the longest consecutive sequence of 
     *                      numbers added so far.
     */
    public static class ConsecutiveTracker {
        // TODO: Define internal data structures (e.g. Map for boundaries or Union-Find)
        
        public void add(int num) {
            // TODO: Implement
        }

        public int getLongest() {
            // TODO: Implement
            return 0;
        }
    }

    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: How can we implement add(num) in O(1) time? 
     * Hint: We can track the lengths of sequences at their boundary elements (left and right) 
     * using a HashMap. When a new number is added, it merges with its left and right neighbors.
     * 
     * Your Answer: 
     * 
     */
}
