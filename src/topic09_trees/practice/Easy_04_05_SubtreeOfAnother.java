package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_04_05_SubtreeOfAnother {

    /**
     * Drill 5/5 for Easy_04_SubtreeOfAnother — Shallowest Matching Depth
     * Technique: capstone — same "for every node of root, try to match against subRoot"
     * pattern as Easy_04_SubtreeOfAnother, but a depth counter is threaded through the
     * search recursion so that, on a match, the depth at which it was found can be
     * reported instead of a plain boolean.
     *
     * Given the roots of two binary trees root and subRoot, return the smallest depth
     * (root itself is depth 0) at which a node's subtree matches subRoot exactly, or -1
     * if no match exists anywhere in root.
     *
     * Example:
     * Input: root = [3,4,5,1,2], subRoot = [1]
     * Output: 2
     * Explanation: the node with value 1 is a leaf under 4, two levels below the root,
     * and its (single-node) subtree matches subRoot.
     */
    public int shallowestMatchingDepth(TreeNode root, TreeNode subRoot) {
        // TODO: Implement your solution here.
        return 0;
    }
}
