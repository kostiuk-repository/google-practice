package topic04_hash_tables.practice;

public class Easy_08_05_WordPattern {

    /**
     * Drill 5/5 for Easy_08_WordPattern — Word Pattern II (Unsegmented String)
     * Technique: capstone — extends the bijection-mapping idea from Easy_08_WordPattern with a
     * search: s no longer has spaces telling you where words start and end, so you must try
     * different split points (backtracking) while maintaining the same two-map
     * (pattern-char -> word, word -> pattern-char) consistency check at every candidate split.
     *
     * Given a pattern and a string s with NO spaces, return true if s can be segmented into
     * substrings such that there is a bijection between pattern characters and those
     * substrings (every occurrence of a pattern character maps to the same substring, and no
     * two pattern characters map to the same substring).
     *
     * Example:
     * Input: pattern = "abab", s = "redblueredblue"
     * Output: true
     * Explanation: split s into "red","blue","red","blue" matching a=red, b=blue.
     */
    public boolean wordPatternMatch(String pattern, String s) {
        // TODO: Implement your solution here.
        return false;
    }
}
