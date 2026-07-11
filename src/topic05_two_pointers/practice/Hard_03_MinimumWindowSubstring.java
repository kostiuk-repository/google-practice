package topic05_two_pointers.practice;

public class Hard_03_MinimumWindowSubstring {

    /**
     * Problem: Minimum Window Substring
     * 
     * Given two strings s and t of lengths m and n respectively, return the minimum window substring 
     * of s such that every character in t (including duplicates) is included in the window. 
     * If there is no such substring, return the empty string "".
     * 
     * The test cases will be generated such that the answer is unique.
     * 
     * Example:
     * Input: s = "ADOBECODEBANC", t = "ABC"
     * Output: "BANC"
     * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
     * 
     * Constraint: Solve it in O(m + n) time complexity.
     */
    public String minWindow(String s, String t) {
        // TODO: Implement your solution here using Sliding Window / Two Pointers.
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
     * Mentor Question: In this problem, the window bounds are expanded by moving the right pointer 
     * and contracted by moving the left pointer. How do you keep track of whether the current 
     * window contains all the characters in t in O(1) time per character check?
     * 
     * Your Answer: 
     * 
     */
}
