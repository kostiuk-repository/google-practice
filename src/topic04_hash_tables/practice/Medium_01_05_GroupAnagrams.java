package topic04_hash_tables.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_01_05_GroupAnagrams {

    /**
     * Drill 5/5 for Medium_01_GroupAnagrams — Group Anagrams Ignoring Case and Non-Letters
     * Technique: capstone — combines the canonical-key HashMap grouping from
     * Medium_01_GroupAnagrams with a normalization pass first (lowercase and strip non-letter
     * characters) before computing the canonical key, so strings that differ only by case or
     * punctuation still land in the same group.
     *
     * Given an array of strings strs, group them so that two strings land in the same group if
     * their letters (ignoring case, spaces, and punctuation) are anagrams of each other. Return
     * the answer as a List<List<String>> of the ORIGINAL (unmodified) strings, in any order.
     *
     * Example:
     * Input: strs = ["Eat!", "tea", "T.A.N", "ate", "Nat", "bat"]
     * Output: [["Eat!","tea","ate"],["T.A.N","Nat"],["bat"]]
     */
    public List<List<String>> groupAnagramsNormalized(String[] strs) {
        // TODO: Implement your solution here.
        return null;
    }
}
