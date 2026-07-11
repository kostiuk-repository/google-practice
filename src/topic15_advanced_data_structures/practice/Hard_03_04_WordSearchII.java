package topic15_advanced_data_structures.practice;

import java.util.List;
import java.util.ArrayList;

public class Hard_03_04_WordSearchII {

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String word;
    }

    /**
     * Drill 4/5 for Hard_03_WordSearchII — WordSearchII
     * Technique: Trie + DFS (Backtracking on Grid)
     *
     * DFS пошук слів за допомогою Trie нод.
     */
    public void searchWithTrie(char[][] board, TrieNode node, int r, int c, boolean[][] visited, List<String> result) {
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
     * Mentor Question: Чому перехід по дереву Trie паралельно з переміщенням по сітці значно оптимізує пошук?
     * 
     * Your Answer: 
     * 
     */
}
