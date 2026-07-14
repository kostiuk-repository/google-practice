package topic04_hash_tables.practice;

import java.util.*;

public class Medium_04_DesignTwitter {

    /**
     * Problem: Design Twitter
     * 
     * Design a simplified version of Twitter where users can post tweets, follow/unfollow 
     * another user, and is able to see the 10 most recent tweets in the user's news feed.
     * 
     * Implement the Twitter class:
     * - Twitter() Initializes your twitter object.
     * - void postTweet(userId, tweetId) Composes a new tweet with ID tweetId by the user userId. 
     *   Each call to this function will be made with a unique tweetId.
     * - List<Integer> getNewsFeed(userId) Retrieves the 10 most recent tweet IDs in the user's 
     *   news feed. Each item in the news feed must be posted by users who the user followed or 
     *   by the user themself. Tweets must be ordered from most recent to least recent.
     * - void follow(followerId, followeeId) The user followerId started following the user followeeId.
     * - void unfollow(followerId, followeeId) The user followerId started unfollowing the user followeeId.
     */
    static class Twitter {
        // TODO: Define internal tables for followers, tweets, and timestamp tracker.

        public Twitter() {
            
        }
        
        public void postTweet(int userId, int tweetId) {
            // TODO: Implement
        }
        
        public List<Integer> getNewsFeed(int userId) {
            // TODO: Implement
            return null;
        }
        
        public void follow(int followerId, int followeeId) {
            // TODO: Implement
        }
        
        public void unfollow(int followerId, int followeeId) {
            // TODO: Implement
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
     * Mentor Question: Pulling the 10 most recent tweets from self and all followees 
     * is a classic "Merge K Sorted Lists" problem (since each user's tweets are already sorted 
     * by timestamp). 
     * 1. How do you assign global timestamps to tweets to order them correctly?
     * 2. How does a PriorityQueue (Min-Heap / Max-Heap) help you retrieve the top 10 most recent tweets?
     * 
     * Your Answer: 
     * 
     */
}
