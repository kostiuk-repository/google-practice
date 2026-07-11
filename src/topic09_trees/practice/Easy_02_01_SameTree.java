package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_02_01_SameTree {

    /**
     * Drill 1/5 for Easy_02_SameTree — Same Shape (Ignore Values)
     * Technique: same synchronized two-tree recursion as Easy_02_SameTree (recurse on
     * p.left/q.left and p.right/q.right, base cases on null), but the value comparison
     * is dropped — only the null/non-null pattern of the two trees must match.
     *
     * Given the roots of two binary trees p and q, return true if they have the exact
     * same STRUCTURE (a node exists in p if and only if the corresponding node exists in
     * q), regardless of what values the nodes hold.
     *
     * Example:
     * Input: p = [1,2,3], q = [9,8,7]
     * Output: true
     * Explanation: both trees have a root with a left and a right child; values differ
     * but the shape is identical.
     */
    public boolean isSameShape(TreeNode p, TreeNode q) {
        // TODO: Implement your solution here.
        return false;
    }
}
