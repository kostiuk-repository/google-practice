package topic15_advanced_data_structures.practice;

public class Easy_06_05_ImplementTrieEasy {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }

    /**
     * Drill 5/5 for Easy_06_ImplementTrieEasy — ImplementTrieEasy
     * Technique: Префіксне дерево (Trie Node array-based)
     *
     * Пошук префікса в TrieNode.
     */
    public boolean startsWithPrefix(TrieNode root, String prefix) {
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
     * Mentor Question: Чому при пошуку префікса нам не важливо, чи встановлений прапорець isWord у кінцевому вузлі?
     * 
     * Your Answer: 
     * 
     */
}
