package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_03_04_SymmetricTree {

    /**
     * Drill 4/5 for Easy_03_SymmetricTree — Count Mismatched Mirror Pairs
     * Technique: same mirror-pair recursion as Easy_03_SymmetricTree, but instead of
     * short-circuiting to false on the first asymmetry, every mirrored pair is visited and
     * a running count of value-mismatched pairs is accumulated and returned.
     *
     * Given the root of a binary tree, return the number of mirrored node PAIRS whose
     * values differ (treat a pair where exactly one side is null as a mismatch too; a pair
     * where both sides are null contributes nothing).
     *
     * Example:
     * Input: root = [1,2,2,3,4,4,3]
     * Output: 0
     * Explanation: the tree is perfectly symmetric, so no mirrored pair mismatches.
     *
     * Example 2:
     * Input: root = [1,2,2,null,3,null,3]
     * Output: 0
     * Explanation: the missing children on both sides mirror each other; only the (3,3)
     * pair exists and matches.
     */
    public int countMismatchedPairs(TreeNode root) {
        // TODO: Implement your solution here.
        return 0;
    }
}
