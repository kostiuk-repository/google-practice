package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_05_02_InvertTree {

    /**
     * Drill 2/5 for Easy_05_InvertTree — Invert Subtree By Value
     * Technique: same recursive left/right swap as Easy_05_InvertTree, but first a search
     * locates the node holding a given target value, and only the subtree rooted there is
     * inverted — combining a value-search step with the swap recursion.
     *
     * Given the root of a binary tree and an integer target, find the node whose value
     * equals target and invert (mirror) only the subtree rooted at that node, in place.
     * Return the (possibly modified) tree root. If target is not found, return root
     * unchanged.
     *
     * Example:
     * Input: root = [1,2,3,4,5,6,7], target = 3
     * Output: [1,2,3,4,5,7,6]
     * Explanation: only the subtree rooted at 3 (children 6 and 7) is inverted; the rest
     * of the tree is untouched.
     */
    public TreeNode invertSubtreeByValue(TreeNode root, int target) {
        // TODO: Implement your solution here.
        return null;
    }
}
