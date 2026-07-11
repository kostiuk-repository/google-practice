package topic15_advanced_data_structures.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Medium_01_05_ImplementTrie {

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord;
    }

    /**
     * Drill 5/5 for Medium_01_ImplementTrie — ImplementTrie
     * Technique: Trie (Prefix Tree) з HashMap дочірніх нод
     *
     * Автодоповнення: знаходження всіх слів у Trie, що починаються з prefix.
     */
    public List<String> autocomplete(TrieNode root, String prefix) {
        // TODO: Implement your solution here.
        return null;
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
     * Mentor Question: Який алгоритм обходу (DFS чи BFS) є більш природним для збирання слів з піддерева?
     * 
     * Your Answer: 
     * 
     */
}
