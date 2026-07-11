package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Easy_05_04_InvertTree {

    /**
     * Drill 4/5 for Easy_05_InvertTree — Invert Only Even Depths
     * Technique: same recursive left/right swap as Easy_05_InvertTree, generalized with a
     * depth parameter threaded through the recursion that decides, at each level, WHETHER
     * to swap the children (only when depth is even) before recursing deeper.
     *
     * Given the root of a binary tree, invert (swap left/right children) only at nodes
     * whose depth is even (root is depth 0), leaving nodes at odd depth unswapped. Return
     * the modified root.
     *
     * Example:
     * Input: root = [1,2,3,4,5,6,7]
     * Output: [1,3,2,4,5,6,7]
     * Explanation: depth 0 (root) is even, so children 2 and 3 swap. Depth 1 nodes (2 and
     * 3, now swapped into place) are odd, so THEIR children are left as-is. Depth 2 nodes
     * (4,5,6,7) are even but are leaves with no children, so swapping them is a no-op —
     * the only visible change is the root-level swap.
     */
    public TreeNode invertEvenDepths(TreeNode root) {
        // TODO: Implement your solution here.
        return null;
    }
}
