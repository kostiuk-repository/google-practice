package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_06_02_DiameterOfTree {

    /**
     * Drill 2/5 for Easy_06_DiameterOfTree — Diameter In Node Count
     * Technique: same post-order height recursion and "leftHeight + rightHeight" combine
     * step used by Easy_06_DiameterOfTree at every node, but the formula is expressed in
     * NUMBER OF NODES on the path instead of number of edges: leftNodes + rightNodes + 1.
     *
     * Given the root of a binary tree, return the diameter measured as the number of
     * NODES on the longest path between any two nodes in the tree (this path may or may
     * not pass through the root).
     *
     * Example:
     * Input: root = [1,2,3,4,5]
     * Output: 3
     * Explanation: the longest path (e.g. 4 -> 2 -> 1 -> 3, or 4 -> 2 -> 5) — the widest
     * such path passing through node 2 (4, 2, 5) contains 3 nodes.
     */
    public int diameterInNodes(TreeNode root) {
        // TODO: Implement your solution here.
        return 0;
    }
}
