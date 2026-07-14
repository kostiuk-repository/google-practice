package topic01_arrays_strings.practice;

public class Hard_01_FirstMissingPositive {

    /**
     * Problem: First Missing Positive
     * 
     * Given an unsorted integer array nums, return the smallest missing positive integer.
     * You must implement an algorithm that runs in O(N) time and uses O(1) auxiliary space.
     * 
     * Example:
     * Input: nums = [1,2,0]
     * Output: 3
     * 
     * Example 2:
     * Input: nums = [3,4,-1,1]
     * Output: 2
     */
    public int firstMissingPositive(int[] nums) {
        // TODO: Implement your solution here in O(N) time and O(1) space.
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
     * Mentor Question: The O(1) space constraint is the tricky part because normally, 
     * a HashSet of size O(N) makes this trivial. How can we use the input array itself 
     * as a "hash map/index tracker" (cyclic sort / index placement) to achieve O(1) space? 
     * What is the target index for a number `x`?
     * 
     * Your Answer: 
     * 
     */
}
