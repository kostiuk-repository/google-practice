package topic15_advanced_data_structures.practice;

import java.util.List;
import java.util.ArrayList;

public class Hard_03_05_WordSearchII {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String word;
    }

    /**
     * Drill 5/5 for Hard_03_WordSearchII — WordSearchII
     * Technique: Trie + DFS (Backtracking on Grid)
     *
     * Реалізація DFS обходу з видаленням знайдених слів з Trie (pruning).
     */
    public void searchAndPrune(char[][] board, TrieNode root, int r, int c, boolean[][] visited, List<String> result) {
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
     * Mentor Question: Як видалення знайденого слова або невикористаної гілки з Trie запобігає повторним перевіркам?
     * 
     * Your Answer: 
     * 
     */
}
