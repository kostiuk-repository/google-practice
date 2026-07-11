package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_04_03_SubtreeOfAnother {

    /**
     * Drill 3/5 for Easy_04_SubtreeOfAnother — Subtree Shape Only
     * Technique: same "for every node of root, try to match the subtree rooted there
     * against subRoot" pattern as Easy_04_SubtreeOfAnother, but the matching helper
     * ignores values and compares only the null/non-null structure of the two subtrees.
     *
     * Given the roots of two binary trees root and subRoot, return true if root contains
     * a subtree whose SHAPE (ignoring node values) is identical to subRoot's shape.
     *
     * Example:
     * Input: root = [3,4,5,1,2], subRoot = [9,7,8]
     * Output: true
     * Explanation: the subtree rooted at 4 has a left and right child, matching subRoot's
     * shape, even though the values differ.
     */
    public boolean isSubtreeShape(TreeNode root, TreeNode subRoot) {
        // TODO: Implement your solution here.
        return false;
    }
}
