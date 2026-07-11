package topic15_advanced_data_structures.practice;

import java.util.Map;
import java.util.HashMap;

public class Medium_01_04_ImplementTrie {

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord;
    }

    /**
     * Drill 4/5 for Medium_01_ImplementTrie — ImplementTrie
     * Technique: Trie (Prefix Tree) з HashMap дочірніх нод
     *
     * Видалення слова з Trie (встановлення прапорця isWord = false та каскадне очищення порожніх гілок).
     */
    public boolean deleteWord(TrieNode root, String word) {
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
     * Mentor Question: Чому не можна просто видалити кінцевий вузол, якщо він має дочірні вузли?
     * 
     * Your Answer: 
     * 
     */
}
