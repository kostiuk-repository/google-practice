package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_03_02_SymmetricTree {

    /**
     * Drill 2/5 for Easy_03_SymmetricTree — Structural Symmetry Only
     * Technique: same mirror-pair recursion as Easy_03_SymmetricTree (compare left.left
     * with right.right, left.right with right.left), but the value comparison is dropped —
     * only the null/non-null shape needs to mirror itself.
     *
     * Given the root of a binary tree, return true if the tree's SHAPE is symmetric around
     * its center (a node exists on the left side if and only if the mirrored position on
     * the right side also has a node), regardless of the values stored in the nodes.
     *
     * Example:
     * Input: root = [1,2,2,3,4,7,8]
     * Output: true
     * Explanation: every node on the left has a mirrored node on the right, even though
     * their values (3 vs 7, 4 vs 8) are not equal.
     */
    public boolean isStructurallySymmetric(TreeNode root) {
        // TODO: Implement your solution here.
        return false;
    }
}
