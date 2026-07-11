package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Easy_03_MakeStringGreat {

    /**
     * Problem: Make The String Great
     * 
     * Given a string s of lower and upper case English letters.
     * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
     * - 0 <= i <= s.length() - 2
     * - s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
     * 
     * To make the string good, you can choose two adjacent characters that make the string bad and remove them. 
     * You can keep doing this until the string becomes good.
     * 
     * Return the string after making it good.
     * 
     * Example:
     * Input: s = "leEeetcode"
     * Output: "leetcode"
     * Explanation: In the first step, "eE" is removed, leaving "leetcode".
     */
    public String makeGood(String s) {
        // TODO: Implement your solution here.
        return "";
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
     * Mentor Question: How do you mathematically check if two characters are the same letter 
     * but different cases in ASCII without calling `Character.toLowerCase()`? 
     * Hint: Look up the distance between 'a' and 'A' in ASCII table.
     * 
     * Your Answer: 
     * 
     */
}
