package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_08_02_WordPattern {

    /**
     * Drill 2/5 for Easy_08_WordPattern — Reconstruct The Pattern Mapping
     * Technique: same two-way bijection check as Easy_08_WordPattern, but instead of a
     * boolean, return the actual pattern-char -> word mapping built while validating it.
     *
     * Given a pattern and a string s of space-separated words that DO follow the pattern,
     * return the Map<Character, String> mapping each pattern character to its word. If s does
     * not follow the pattern, return an empty map.
     *
     * Example:
     * Input: pattern = "abba", s = "dog cat cat dog"
     * Output: {a=dog, b=cat}
     */
    public Map<Character, String> buildPatternMapping(String pattern, String s) {
        // TODO: Implement your solution here.
        return new HashMap<>();
    }
}
