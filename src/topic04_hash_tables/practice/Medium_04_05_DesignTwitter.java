package topic04_hash_tables.practice;

import java.util.*;

public class Medium_04_05_DesignTwitter {

    /**
     * Drill 5/5 for Medium_04_DesignTwitter — News Feed Cache
     * Technique: components integration
     *
     * Implement a class NewsFeedCache that allows posting tweets with explicit timestamps, 
     * managing follows, and retrieving a news feed containing up to 10 most recent 
     * tweets from the user and their followees.
     */
    public static class NewsFeedCache {
        // TODO: Define structures for followees and user tweets
        
        public void postTweet(int userId, int tweetId, int timestamp) {
            // TODO: Implement
        }
        
        public void follow(int followerId, int followeeId) {
            // TODO: Implement
        }
        
        public List<Integer> getNewsFeed(int userId) {
            // TODO: Implement (return top 10 most recent tweet IDs)
            return new ArrayList<>();
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
     * Mentor Question: How do you handle the case where a user follows themselves 
     * or unfollows someone they never followed in this simplified class?
     * 
     * Your Answer: 
     * 
     */
}
