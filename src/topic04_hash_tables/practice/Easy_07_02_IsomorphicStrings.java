package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_07_02_IsomorphicStrings {

    /**
     * Drill 2/5 for Easy_07_IsomorphicStrings — Reconstruct The Character Mapping
     * Technique: same two-way bijection check as Easy_07_IsomorphicStrings, but instead of a
     * boolean, return the actual s -> t character mapping that was built while validating it.
     *
     * Given two strings s and t of equal length that ARE isomorphic, return the
     * Map<Character, Character> mapping each character of s to its corresponding character in
     * t. If s and t are not isomorphic, return an empty map.
     *
     * Example:
     * Input: s = "egg", t = "add"
     * Output: {e=a, g=d}
     */
    public Map<Character, Character> buildIsomorphicMapping(String s, String t) {
        // TODO: Implement your solution here.
        return new HashMap<>();
    }
}
