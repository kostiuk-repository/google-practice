package topic15_advanced_data_structures.practice;

public class Easy_06_02_ImplementTrieEasy {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }

    /**
     * Drill 2/5 for Easy_06_ImplementTrieEasy — ImplementTrieEasy
     * Technique: Префіксне дерево (Trie Node array-based)
     *
     * Створення структури TrieNode та перевірка наявності дочірнього вузла.
     */
    public boolean hasChild(TrieNode node, char c) {
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
     * Mentor Question: Чому використання статичного масиву розміром 26 може призводити до значних витрат пам'яті?
     * 
     * Your Answer: 
     * 
     */
}
