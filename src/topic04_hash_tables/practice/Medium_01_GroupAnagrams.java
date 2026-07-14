package topic04_hash_tables.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Medium_01_GroupAnagrams {

    /**
     * Problem: Group Anagrams
     * 
     * Given an array of strings strs, group the anagrams together. 
     * You can return the answer in any order.
     * 
     * Example:
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Implement your solution here using HashMap.
        return null;
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
     * Mentor Question: To group anagrams, we need a common "key" representer for anagram strings.
     * Two popular keys are:
     * 1. Sorting the string characters (e.g. "eat" -> "aet"). What is the complexity for a string of length L?
     * 2. Frequency counting representation (e.g., "1#0#...#1#0"). What is the complexity?
     * Compare these two key representations and their time complexities.
     * 
     * Your Answer: 
     * 
     */
}
