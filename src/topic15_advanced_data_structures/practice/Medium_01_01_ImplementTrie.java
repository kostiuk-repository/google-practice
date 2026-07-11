package topic15_advanced_data_structures.practice;

import java.util.Map;
import java.util.HashMap;

public class Medium_01_01_ImplementTrie {

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord;
    }

    /**
     * Drill 1/5 for Medium_01_ImplementTrie — ImplementTrie
     * Technique: Trie (Prefix Tree) з HashMap дочірніх нод
     *
     * Пошук слова в Trie на основі HashMap.
     */
    public boolean searchHashMap(TrieNode root, String word) {
        // TODO: Implement your solution here.
        return false;
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
     * Mentor Question: Яка перевага HashMap перед масивом розміром 26 при зберіганні рідкісних символів?
     * 
     * Your Answer: 
     * 
     */
}
