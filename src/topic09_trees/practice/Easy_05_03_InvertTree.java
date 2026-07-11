package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_05_03_InvertTree {

    /**
     * Drill 3/5 for Easy_05_InvertTree — Inverted Copy (No Mutation)
     * Technique: same recursive left/right swap logic as Easy_05_InvertTree, but instead
     * of reusing and mutating the existing nodes, a BRAND NEW node is constructed at each
     * step (new TreeNode with swapped children built from recursive results), leaving the
     * original tree completely untouched.
     *
     * Given the root of a binary tree, return a NEW tree that is the mirror image of the
     * input tree, without modifying any node of the original tree.
     *
     * Example:
     * Input: root = [1,2,3]
     * Output: a new tree [1,3,2]; the original root's left/right fields still point to 2
     * and 3 respectively, unchanged.
     */
    public TreeNode invertTreeCopy(TreeNode root) {
        // TODO: Implement your solution here.
        return null;
    }
}
