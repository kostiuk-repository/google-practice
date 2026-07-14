package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_06_FirstUniqueChar {

    /**
     * Problem: First Unique Character in a String
     * 
     * Given a string s, find the first non-repeating character in it and return its index. 
     * If it does not exist, return -1.
     * 
     * Example:
     * Input: s = "leetcode"
     * Output: 0
     * Explanation: The character 'l' at index 0 is the first character that does not occur 
     * at any other index in the string.
     */
    public int firstUniqChar(String s) {
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
     * Mentor Question: If we use a two-pass algorithm (Pass 1: fill frequency map, Pass 2: check 
     * first char in s with freq == 1), what is the time complexity? 
     * If s is a massive stream of characters and we can only access characters one-by-one 
     * in a single pass, how would you optimize this using a LinkedHashMap?
     * 
     * Your Answer: 
     * 
     */
}
