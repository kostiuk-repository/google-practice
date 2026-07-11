package topic15_advanced_data_structures.practice;

public class Medium_04_04_DesignAddSearchWords {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }

    /**
     * Drill 4/5 for Medium_04_DesignAddSearchWords — DesignAddSearchWords
     * Technique: Trie з рекурсивним пошуком та регулярними виразами (Wildcard Search)
     *
     * Повний рекурсивний пошук з підтримкою довільної кількості крапок у слові.
     */
    public boolean searchRecursive(TrieNode root, String word, int index) {
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
     * Mentor Question: У чому небезпека глибокої рекурсії при пошуку довгих шаблонів з крапками?
     * 
     * Your Answer: 
     * 
     */
}
