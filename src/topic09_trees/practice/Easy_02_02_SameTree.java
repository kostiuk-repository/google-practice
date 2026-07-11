package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_02_02_SameTree {

    /**
     * Drill 2/5 for Easy_02_SameTree — Is Mirror
     * Technique: the same synchronized two-tree recursion as Easy_02_SameTree, but the
     * pairing of children is crossed — p.left is compared against q.right and p.right
     * against q.left — checking mirror-equality instead of exact structural equality.
     *
     * Given the roots of two binary trees p and q, return true if q is the mirror image
     * of p (p.val == q.val at every level, but p's left subtree mirrors q's right
     * subtree and vice versa).
     *
     * Example:
     * Input: p = [1,2,3], q = [1,3,2]
     * Output: true
     * Explanation: p's left child (2) matches q's right child (2), and p's right child
     * (3) matches q's left child (3).
     */
    public boolean isMirror(TreeNode p, TreeNode q) {
        // TODO: Implement your solution here.
        return false;
    }
}
