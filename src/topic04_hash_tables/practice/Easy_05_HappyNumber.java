package topic04_hash_tables.practice;

import java.util.HashSet;
import java.util.Set;

public class Easy_05_HappyNumber {

    /**
     * Problem: Happy Number
     * 
     * Write an algorithm to determine if a number n is happy.
     * A happy number is a number defined by the following process:
     * - Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * - Repeat the process until the number equals 1 (where it will stay), 
     *   or it loops endlessly in a cycle which does not include 1.
     * - Those numbers for which this process ends in 1 are happy.
     * 
     * Return true if n is a happy number, and false if not.
     * 
     * Example:
     * Input: n = 19
     * Output: true
     * Explanation:
     * 1^2 + 9^2 = 82
     * 8^2 + 2^2 = 68
     * 6^2 + 8^2 = 100
     * 1^2 + 0^2 + 0^2 = 1
     */
    public boolean isHappy(int n) {
        // TODO: Implement your solution here.
        return false;
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
     * Mentor Question: This problem relies on detecting cycles (either we hit 1, or we hit a number 
     * we have seen before, entering an infinite loop). 
     * How does a HashSet help detect this? 
     * Bonus: How can we solve this without a HashSet (using Floyd's Cycle Detection / Tortoise & Hare)?
     * 
     * Your Answer: 
     * 
     */
}
