package topic15_advanced_data_structures.practice;

import java.util.Map;
import java.util.HashMap;

public class Medium_01_02_ImplementTrie {

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord;
    }

    /**
     * Drill 2/5 for Medium_01_ImplementTrie — ImplementTrie
     * Technique: Trie (Prefix Tree) з HashMap дочірніх нод
     *
     * Вставка слова в Trie на основі HashMap.
     */
    public void insertHashMap(TrieNode root, String word) {
        // TODO: Implement your solution here.
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
     * Mentor Question: Який метод класу Map є найбільш зручним для вставки ноди, якщо її ще немає (наприклад, computeIfAbsent)?
     * 
     * Your Answer: 
     * 
     */
}
