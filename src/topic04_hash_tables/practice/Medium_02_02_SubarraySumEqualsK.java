package topic04_hash_tables.practice;

import java.util.*;

public class Medium_02_02_SubarraySumEqualsK {

    /**
     * Drill 2/5 for Medium_02_SubarraySumEqualsK — Longest Subarray Sum Equals K
     * Technique: prefix sum, hash map index tracking
     *
     * Given an array of integers nums and an integer k, return the length of the 
     * longest contiguous subarray that sums to k. If no such subarray exists, return 0.
     *
     * Input: nums = [1, -1, 5, -2, 3], k = 3
     * Output: 4 (subarray [1, -1, 5, -2] sums to 3)
     */
    public int maxSubArrayLen(int[] nums, int k) {
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
     * Mentor Question: Why do we only store the first occurrence of a prefix sum 
     * in our map when trying to find the longest subarray, rather than updating it 
     * every time we see that prefix sum?
     * 
     * Your Answer: 
     * 
     */
}
