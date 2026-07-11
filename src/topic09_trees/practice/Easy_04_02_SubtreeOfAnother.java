package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_04_02_SubtreeOfAnother {

    /**
     * Drill 2/5 for Easy_04_SubtreeOfAnother — Count Exact Matches
     * Technique: same "for every node of root, run the isSameTree matching helper on the
     * subtree rooted there" pattern as Easy_04_SubtreeOfAnother, but instead of stopping
     * and returning true on the first match, every node is checked and the total number
     * of matches is accumulated and returned.
     *
     * Given the roots of two binary trees root and subRoot, return the number of nodes in
     * root whose subtree is structurally identical (same shape and values) to subRoot.
     *
     * Example:
     * Input: root = [3,4,5,1,2,4,5,null,null,null,null,0,null,0], subRoot = [4,1,2]
     * Output: 2
     * Explanation: both occurrences of the subtree rooted at value 4 match subRoot.
     */
    public int countIdenticalSubtrees(TreeNode root, TreeNode subRoot) {
        // TODO: Implement your solution here.
        return 0;
    }
}
