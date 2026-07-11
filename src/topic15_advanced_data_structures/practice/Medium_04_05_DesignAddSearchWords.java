package topic15_advanced_data_structures.practice;

public class Medium_04_05_DesignAddSearchWords {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }

    /**
     * Drill 5/5 for Medium_04_DesignAddSearchWords — DesignAddSearchWords
     * Technique: Trie з рекурсивним пошуком та регулярними виразами (Wildcard Search)
     *
     * Пошук префікса слова, що підтримує символи підстановки.
     */
    public boolean searchPrefixWildcard(TrieNode root, String prefix, int index) {
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
     * Mentor Question: Який прапорець (isWord чи просто null-перевірка ноди) визначає успіх префіксного пошуку?
     * 
     * Your Answer: 
     * 
     */
}
