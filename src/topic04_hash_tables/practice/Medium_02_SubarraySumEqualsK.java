package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Medium_02_SubarraySumEqualsK {

    /**
     * Problem: Subarray Sum Equals K
     * 
     * Given an array of integers nums and an integer k, return the total number of subarrays 
     * whose sum equals to k.
     * 
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * 
     * Example:
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     * Explanation: [1,1] from index 0 to 1, and [1,1] from index 1 to 2.
     * 
     * Constraint: Solve this in O(N) time using Prefix Sum and HashMap.
     */
    public int subarraySum(int[] nums, int k) {
        // TODO: Implement your solution here.
        return 0;
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
     * Mentor Question: Why do we need to initialize the HashMap with `seenPrefixSums.put(0, 1)`? 
     * What edge case does this handle (e.g. when a prefix sum from index 0 to i equals exactly k)?
     * 
     * Your Answer: 
     * 
     */
}
