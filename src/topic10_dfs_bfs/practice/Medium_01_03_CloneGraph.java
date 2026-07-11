package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;

public class Medium_01_03_CloneGraph {

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
     * Drill 3/5 for Medium_01_CloneGraph — Clone Nodes Only
     * Technique: return a list of all cloned nodes from a cyclic graph, but do not populate neighbors yet.
     *
     * Input: node = Node(1) connected to Node(2)
     * Output: [Clone(1), Clone(2)]
     */
    public List<Node> cloneNodesOnly(Node node) {
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
     * Mentor Question: Which traversal (DFS or BFS) is more intuitive for tracking visited nodes in a graph?
     * 
     * Your Answer: 
     * 
     */
}
