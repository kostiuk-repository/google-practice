package topic03_stacks_queues.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Deque;
import java.util.ArrayDeque;

public class Easy_10_NextGreaterElementI {

    /**
     * Problem: Next Greater Element I
     * 
     * The next greater element of some element x in an array is the first greater element 
     * that is to the right of x in the same array.
     * 
     * You are given two 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
     * For each 0 <= i < nums1.length, find the index j such that nums2[j] == nums1[i] and determine 
     * the next greater element of nums2[j] in nums2. If there is no next greater element, 
     * the answer for this query is -1.
     * 
     * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
     * 
     * Example:
     * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
     * Output: [-1,3,-1]
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // TODO: Implement your solution here using a Monotonic Stack and a HashMap.
        return new int[0];
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
     * Mentor Question: Explain the flow of using a monotonic stack to precompute the 
     * "next greater element" for all numbers in nums2, and how a HashMap links this 
     * precomputed result back to the queries in nums1 in O(1) lookup time.
     * 
     * Your Answer: 
     * 
     */
}
