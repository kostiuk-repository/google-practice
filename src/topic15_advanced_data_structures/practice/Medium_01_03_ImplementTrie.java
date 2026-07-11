package topic15_advanced_data_structures.practice;

import java.util.Map;
import java.util.HashMap;

public class Medium_01_03_ImplementTrie {

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord;
    }

    /**
     * Drill 3/5 for Medium_01_ImplementTrie — ImplementTrie
     * Technique: Trie (Prefix Tree) з HashMap дочірніх нод
     *
     * Пошук префікса в Trie на основі HashMap.
     */
    public boolean startsWithHashMap(TrieNode root, String prefix) {
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
     * Mentor Question: Як перевірити наявність префікса без досягнення кінцевого прапорця isWord?
     * 
     * Your Answer: 
     * 
     */
}
