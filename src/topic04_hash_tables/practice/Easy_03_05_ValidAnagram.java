package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_03_05_ValidAnagram {

    /**
     * Drill 5/5 for Easy_03_ValidAnagram — Minimum Replacements To Make Anagram
     * Technique: capstone — instead of a boolean yes/no from the frequency-difference check in
     * Easy_03_ValidAnagram, sum up the positive leftover counts in the frequency-difference map
     * to quantify exactly how far apart the two strings are.
     *
     * Given two strings s and t of equal length, return the minimum number of characters you
     * must change in t so that t becomes an anagram of s.
     *
     * Example:
     * Input: s = "bab", t = "aba"
     * Output: 1
     * Explanation: s has two b's and one a; t has two a's and one b. Changing one 'a' in t to
     * 'b' makes t = "bba"... actually changing one character resolves the one-count surplus,
     * so the answer is 1.
     */
    public int minReplacementsToAnagram(String s, String t) {
        // TODO: Implement your solution here.
        return 0;
    }
}
