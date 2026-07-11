package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;

public class Medium_01_01_CloneGraph {

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
     * Drill 1/5 for Medium_01_CloneGraph — Deep Copy a List with Loops
     * Technique: clone a linked list (using neighbors.get(0) as next) containing potential loops.
     *
     * Input: head = Node(1) -> Node(2) -> head
     * Output: Cloned Node(1) -> Cloned Node(2) -> Cloned head
     */
    public Node copyLinkedList(Node head) {
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
     * Mentor Question: How does deep copying a list with cycles differ from a normal list?
     * 
     * Your Answer: 
     * 
     */
}
