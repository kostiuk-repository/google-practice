package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_06_04_DiameterOfTree {

    /**
     * Drill 4/5 for Easy_06_DiameterOfTree — Diameter Through A Given Node
     * Technique: same post-order height recursion as Easy_06_DiameterOfTree, but instead
     * of scanning every node in the tree for the global best "leftHeight + rightHeight",
     * the combine step is evaluated at exactly ONE given target node, constraining the
     * search.
     *
     * Given the root of a binary tree and a reference to a target node known to exist in
     * the tree, return the length (in edges) of the longest path between two nodes in the
     * tree that PASSES THROUGH target (i.e., height of target's left subtree + height of
     * target's right subtree).
     *
     * Example:
     * Input: root = [1,2,3,4,5], target = node with value 2
     * Output: 2
     * Explanation: node 2's left subtree height is 0 (just node 4) and right subtree
     * height is 0 (just node 5), so the longest path through node 2 is 4 -> 2 -> 5, which
     * has 2 edges.
     */
    public int diameterThroughNode(TreeNode root, TreeNode target) {
        // TODO: Implement your solution here.
        return 0;
    }
}
