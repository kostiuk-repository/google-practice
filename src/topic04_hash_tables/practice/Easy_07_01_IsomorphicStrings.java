package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_07_01_IsomorphicStrings {

    /**
     * Drill 1/5 for Easy_07_IsomorphicStrings — One-Way Character Mapping Only
     * Technique: isolates HALF of the two-map bijection check from Easy_07_IsomorphicStrings —
     * build only the s -> t character mapping and verify it is consistent, without checking
     * the reverse t -> s direction. This demonstrates why the full problem needs two maps.
     *
     * Given two strings s and t of equal length, return true if there exists a consistent
     * mapping from each character of s to a character of t (every occurrence of a character
     * in s maps to the same character in t). Do NOT check whether two different characters in
     * s might map to the same character in t.
     *
     * Example:
     * Input: s = "ab", t = "aa"
     * Output: true
     * Explanation: 'a' -> 'a' and 'b' -> 'a' is consistent one-way, even though this would NOT
     * be a valid full isomorphism (two different source characters map to the same target).
     */
    public boolean isOneWayMappable(String s, String t) {
        // TODO: Implement your solution here.
        return false;
    }
}
