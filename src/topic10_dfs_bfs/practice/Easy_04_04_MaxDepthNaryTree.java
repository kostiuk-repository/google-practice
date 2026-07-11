package topic10_dfs_bfs.practice;

import topic09_trees.TreeNode;

public class Easy_04_04_MaxDepthNaryTree {

    /**
     * Drill 4/5 for Easy_04_MaxDepthNaryTree — Is Height-Balanced
     * Technique: builds on the max-depth DFS recursion from Easy_04_MaxDepthNaryTree — at
     * EVERY node, compute the depth of the left and right subtrees (same recursion), and also
     * check that their difference is at most 1; if any node fails this check, the whole tree
     * is unbalanced. A common efficient trick is to return -1 as a sentinel from the depth
     * recursion the moment imbalance is detected, short-circuiting the rest of the DFS.
     *
     * Given the root of a binary tree, return true if it is height-balanced: for every node,
     * the depths of its two subtrees differ by no more than 1.
     *
     * Example:
     * Input: root = [3,9,20,null,null,15,7]
     * Output: true
     *
     * Example 2:
     * Input: root = [1,2,2,3,3,null,null,4,4]
     * Output: false
     */
    public boolean isBalanced(TreeNode root) {
        // TODO: Implement your solution here.
        return false;
    }
}
