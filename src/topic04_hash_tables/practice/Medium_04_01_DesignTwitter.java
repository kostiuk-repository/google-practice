package topic04_hash_tables.practice;

import java.util.*;

public class Medium_04_01_DesignTwitter {

    /**
     * Drill 1/5 for Medium_04_DesignTwitter — Simple Follow Tracker
     * Technique: hash map of hash sets
     *
     * Implement a class FollowTracker that tracks follower relationships.
     */
    public static class FollowTracker {
        // TODO: Define follower map
        
        public void follow(int followerId, int followeeId) {
            // TODO: Implement
        }
        
        public void unfollow(int followerId, int followeeId) {
            // TODO: Implement
        }
        
        public List<Integer> getFollowees(int followerId) {
            // TODO: Implement and return sorted in ascending order
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
     * Mentor Question: Why is a Set preferred over a List to store the followees of a user?
     * What edge case does it prevent (e.g. repeated follow calls)?
     * 
     * Your Answer: 
     * 
     */
}
