package topic04_hash_tables.practice;

import java.util.*;

public class Medium_04_03_DesignTwitter {

    public static class Tweet {
        public int id;
        public int timestamp;
        
        public Tweet(int id, int timestamp) {
            this.id = id;
            this.timestamp = timestamp;
        }
    }

    /**
     * Drill 3/5 for Medium_04_DesignTwitter — Merge Two Sorted Tweet Lists
     * Technique: two pointers merge
     *
     * Given two lists of Tweets, each sorted from most recent to least recent (highest 
     * timestamp first), merge them into a single list of the 10 most recent tweet IDs.
     */
    public List<Integer> mergeTweets(List<Tweet> list1, List<Tweet> list2) {
        // TODO: Implement your solution here.
        return null;
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
     * Mentor Question: Why is a two-pointer merge approach highly efficient for 2 lists? 
     * What is its time complexity relative to the lengths of list1 and list2?
     * 
     * Your Answer: 
     * 
     */
}
