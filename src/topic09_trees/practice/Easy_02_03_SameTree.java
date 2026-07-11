package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_02_03_SameTree {

    /**
     * Drill 3/5 for Easy_02_SameTree — Count Matching Positions
     * Technique: same synchronized two-tree recursion as Easy_02_SameTree, but instead of
     * short-circuiting to a boolean on the first mismatch, every corresponding position is
     * visited and a running count of value-equal positions is accumulated and returned.
     *
     * Given the roots of two binary trees p and q, return the number of positions where
     * BOTH trees have a node at that position AND the two nodes hold equal values.
     * Positions where one tree has a node and the other doesn't do not count.
     *
     * Example:
     * Input: p = [1,2,3], q = [1,9,3]
     * Output: 2
     * Explanation: root (1==1) and right child (3==3) match; left child (2 vs 9) does not.
     */
    public int countMatchingNodes(TreeNode p, TreeNode q) {
        // TODO: Implement your solution here.
        return 0;
    }
}
