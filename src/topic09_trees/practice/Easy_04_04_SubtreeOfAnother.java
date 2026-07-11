package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_04_04_SubtreeOfAnother {

    /**
     * Drill 4/5 for Easy_04_SubtreeOfAnother — Subtree Match At A Leaf
     * Technique: same "for every node of root, try to match against subRoot" pattern as
     * Easy_04_SubtreeOfAnother, but the search is restricted to only the nodes of root
     * that are leaves — a filter condition on WHERE the matching helper may be applied.
     *
     * Given the roots of two binary trees root and subRoot, return true if there exists a
     * LEAF node in root (a node with no children) whose subtree — which, being a leaf, is
     * just that single node — is structurally identical to subRoot.
     *
     * Example:
     * Input: root = [3,4,5,1,2], subRoot = [2]
     * Output: true
     * Explanation: the leaf node with value 2 matches the single-node tree subRoot.
     */
    public boolean isSubtreeMatchAtLeaf(TreeNode root, TreeNode subRoot) {
        // TODO: Implement your solution here.
        return false;
    }
}
