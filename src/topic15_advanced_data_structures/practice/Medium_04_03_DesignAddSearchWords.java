package topic15_advanced_data_structures.practice;

public class Medium_04_03_DesignAddSearchWords {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }

    /**
     * Drill 3/5 for Medium_04_DesignAddSearchWords — DesignAddSearchWords
     * Technique: Trie з рекурсивним пошуком та регулярними виразами (Wildcard Search)
     *
     * Рекурсивний пошук з підтримкою крапки тільки на фіксованій позиції.
     */
    public boolean searchWildcardChar(TrieNode root, String word, int index) {
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
     * Mentor Question: Як реалізувати перевірку всіх дочірніх гілок, коли поточний символ у слові дорівнює крапці?
     * 
     * Your Answer: 
     * 
     */
}
