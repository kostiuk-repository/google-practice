package topic04_hash_tables.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_01_03_GroupAnagrams {

    /**
     * Drill 3/5 for Medium_01_GroupAnagrams — Group Anagrams By Frequency Signature
     * Technique: same HashMap<key, List<String>> grouping shape as Medium_01_GroupAnagrams,
     * but the canonical key is built from a 26-length character-frequency signature (e.g.
     * "1#0#0#...#1") instead of sorting the string — avoids the O(L log L) sort per string in
     * favor of an O(L) counting pass.
     *
     * Given an array of strings strs (lowercase English letters only), group the anagrams
     * together using a frequency-count based key instead of a sorted-character key. Return the
     * answer as a List<List<String>>, in any order.
     *
     * Example:
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
     */
    public List<List<String>> groupAnagramsByFrequencyKey(String[] strs) {
        // TODO: Implement your solution here.
        return null;
    }
}
