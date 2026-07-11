package topic15_advanced_data_structures.practice;

public class Medium_04_02_DesignAddSearchWords {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }

    /**
     * Drill 2/5 for Medium_04_DesignAddSearchWords — DesignAddSearchWords
     * Technique: Trie з рекурсивним пошуком та регулярними виразами (Wildcard Search)
     *
     * Пошук слова без врахування символів підстановки (крапок).
     */
    public boolean searchExact(TrieNode root, String word) {
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
     * Mentor Question: Яка часова складність точного пошуку в Trie?
     * 
     * Your Answer: 
     * 
     */
}
