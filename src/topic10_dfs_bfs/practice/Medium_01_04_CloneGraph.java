package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;

public class Medium_01_04_CloneGraph {

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    /**
     * Drill 4/5 for Medium_01_CloneGraph — Clone Tree Graph
     * Technique: clone a graph that is guaranteed to be a tree (no cycles, no visited map required).
     *
     * Input: root = Node(1) with neighbors [Node(2), Node(3)]
     * Output: Cloned root Node(1) with neighbors [Cloned Node(2), Cloned Node(3)]
     */
    public Node cloneTreeGraph(Node root) {
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
     * Mentor Question: Why is a visited set not required when cloning a directed tree structure?
     * 
     * Your Answer: 
     * 
     */
}
