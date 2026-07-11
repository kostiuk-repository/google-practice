package topic04_hash_tables.practice;

public class Easy_08_01_WordPattern {

    /**
     * Drill 1/5 for Easy_08_WordPattern — One-Way Pattern Mapping Only
     * Technique: isolates HALF of the two-map bijection used in Easy_08_WordPattern — build
     * only the pattern-char -> word mapping and verify consistency, without checking that two
     * different pattern characters don't map to the same word.
     *
     * Given a pattern and a string s split into words, return true if there is a consistent
     * mapping from each character of pattern to a word in s (every occurrence of a pattern
     * character maps to the same word). Do NOT check whether two different pattern characters
     * might map to the same word.
     *
     * Example:
     * Input: pattern = "ab", s = "dog dog"
     * Output: true
     * Explanation: 'a' -> "dog" and 'b' -> "dog" is consistent one-way, even though this would
     * NOT be a valid full bijection (two pattern letters mapping to the same word).
     */
    public boolean isOneWayPatternMappable(String pattern, String s) {
        // TODO: Implement your solution here.
        return false;
    }
}
