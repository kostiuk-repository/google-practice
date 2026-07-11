package topic04_hash_tables.practice;

import java.util.*;

public class Medium_05_04_InsertDeleteGetRandom {

    /**
     * Drill 4/5 for Medium_05_InsertDeleteGetRandom — Randomized Collection with Duplicates
     * Technique: hash map of index sets
     *
     * Implement a RandomizedCollection class that allows duplicates.
     */
    public static class RandomizedCollection {
        // TODO: Define internal tables (e.g., Map<Integer, Set<Integer>> and ArrayList)
        
        public RandomizedCollection() {
            
        }
        
        public boolean insert(int val) {
            // TODO: Implement
            return false;
        }
        
        public boolean remove(int val) {
            // TODO: Implement
            return false;
        }
        
        public int getRandom() {
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
     * Mentor Question: Since duplicates are allowed, a value can have multiple indices. 
     * How do you retrieve one of the indices for removal in O(1) time? 
     * What collection is suitable for storing indices in the map?
     * 
     * Your Answer: 
     * 
     */
}
