package topic04_hash_tables.practice;

import java.util.*;

public class Medium_04_04_DesignTwitter {

    public static class Tweet {
        public int id;
        public int timestamp;
        
        public Tweet(int id, int timestamp) {
            this.id = id;
            this.timestamp = timestamp;
        }
    }

    /**
     * Drill 4/5 for Medium_04_DesignTwitter — Merge K Sorted Tweet Streams
     * Technique: PriorityQueue / Max-Heap merge
     *
     * Given a list of streams (each stream is a list of Tweets sorted from most recent 
     * to least recent), merge them to return the 10 most recent tweet IDs.
     */
    public List<Integer> mergeKTweets(List<List<Tweet>> streams) {
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
     * Mentor Question: When merging K streams using a PriorityQueue, what information 
     * should we store in the queue elements so that we know where to fetch the next tweet 
     * from once a tweet is polled?
     * 
     * Your Answer: 
     * 
     */
}
