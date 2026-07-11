package topic15_advanced_data_structures.practice;

public class Hard_03_03_WordSearchII {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String word;
    }

    /**
     * Drill 3/5 for Hard_03_WordSearchII — WordSearchII
     * Technique: Trie + DFS (Backtracking on Grid)
     *
     * Побудова Trie дерева для списку шуканих слів.
     */
    public void buildTrie(TrieNode root, String[] words) {
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
     * Mentor Question: Навіщо зберігати повне слово у листках Trie замість булевого прапорця?
     * 
     * Your Answer: 
     * 
     */
}
