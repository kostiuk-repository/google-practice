package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Medium_01_02_CloneGraph {

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
     * Drill 2/5 for Medium_01_CloneGraph — Create Clone Node Map
     * Technique: traverse the graph and create a Map of OriginalNode -> ClonedNode (without neighbors links).
     *
     * Input: node = Node(1) connected to Node(2)
     * Output: Map with entries {Node(1): Clone(1), Node(2): Clone(2)}
     */
    public Map<Node, Node> createCloneMap(Node node) {
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
     * Mentor Question: Why does creating the new node instances before copying their neighbor links prevent infinite recursion?
     * 
     * Your Answer: 
     * 
     */
}
