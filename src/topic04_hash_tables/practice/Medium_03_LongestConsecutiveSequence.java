package topic04_hash_tables.practice;

import java.util.HashSet;
import java.util.Set;

public class Medium_03_LongestConsecutiveSequence {

    /**
     * Problem: Longest Consecutive Sequence
     * 
     * Given an unsorted array of integers nums, return the length of the longest consecutive 
     * elements sequence.
     * 
     * You must write an algorithm that runs in O(N) time complexity.
     * 
     * Example:
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
     */
    public int longestConsecutive(int[] nums) {
        // TODO: Implement your solution here in O(N) time.
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
     * Mentor Question: Even though we might do nested loops, we can achieve O(N) time by 
     * only starting a consecutive check when a number is the *start* of a sequence. 
     * How do you check if a number `x` is the start of a sequence in O(1) time using a HashSet?
     * Explain why this ensures each number is processed at most twice, leading to O(N) time.
     * 
     * Your Answer: 
     * 
     */
}
