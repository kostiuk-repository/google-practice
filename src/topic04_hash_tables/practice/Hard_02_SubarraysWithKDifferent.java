package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Hard_02_SubarraysWithKDifferent {

    /**
     * Problem: Subarrays with K Different Integers
     * 
     * Given an integer array nums and an integer k, return the number of good subarrays of nums.
     * A good array is an array where the number of different integers in that array is exactly k.
     * 
     * Example:
     * Input: nums = [1,2,1,2,3], k = 2
     * Output: 7
     * Explanation: Subarrays formed with exactly 2 different integers: 
     * [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
     * 
     * Constraint: Solve it in O(N) time complexity.
     */
    public int subarraysWithKDistinct(int[] nums, int k) {
        // TODO: Implement your solution here using Sliding Window + HashMap.
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
     * Mentor Question: Finding subarrays with *exactly* k distinct integers is difficult. 
     * However, finding subarrays with *at most* k distinct integers is straightforward using 
     * a sliding window. 
     * Explain why the number of subarrays with *exactly* k distinct integers is:
     * $$\text{subarrays}(K) = \text{subarraysAtMost}(K) - \text{subarraysAtMost}(K - 1)$$
     * 
     * Your Answer: 
     * 
     */
}
