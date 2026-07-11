package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_01_04_InorderTraversal {

    /**
     * Drill 4/5 for Easy_01_InorderTraversal — Kth Element Of Inorder Sequence
     * Technique: the same left-root-right recursion as Easy_01_InorderTraversal, but
     * instead of collecting every value into a list, a counter is carried through the
     * recursion and the traversal stops as soon as the counter reaches k (early exit
     * instead of materializing the full result).
     *
     * Given the root of a binary tree and an integer k (1-indexed), return the value of
     * the k-th node visited in an inorder traversal, without building the full list of
     * values first. If k is out of range, return -1.
     *
     * Example:
     * Input: root = [3,1,4,null,2], k = 2   (inorder sequence is [1,2,3,4])
     * Output: 2
     */
    public int kthInorderElement(TreeNode root, int k) {
        // TODO: Implement your solution here.
        return -1;
    }
}
