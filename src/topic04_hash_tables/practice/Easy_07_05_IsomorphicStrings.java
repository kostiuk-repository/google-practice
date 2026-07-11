package topic04_hash_tables.practice;

import java.util.ArrayList;
import java.util.List;

public class Easy_07_05_IsomorphicStrings {

    /**
     * Drill 5/5 for Easy_07_IsomorphicStrings — Group Strings By Isomorphism Pattern
     * Technique: capstone — instead of pairwise-checking two strings with two HashMaps like
     * Easy_07_IsomorphicStrings, encode EACH string into a canonical "pattern key" (e.g. map
     * each character to the index of its first occurrence: "egg" -> "011", "add" -> "011") and
     * group strings sharing the same pattern key using a HashMap<String, List<String>>. Two
     * strings are isomorphic exactly when their pattern keys match.
     *
     * Given a list of strings words, group the words that are isomorphic to each other. Return
     * the groups as a List<List<String>>, in any order.
     *
     * Example:
     * Input: words = ["egg", "add", "foo", "bar", "abb"]
     * Output: [["egg","add","abb"], ["foo"], ["bar"]]
     */
    public List<List<String>> groupByIsomorphism(List<String> words) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
