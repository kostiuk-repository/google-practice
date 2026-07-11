package topic10_dfs_bfs.practice;

import topic09_trees.TreeNode;

public class Easy_04_02_MaxDepthNaryTree {

    /**
     * Drill 2/5 for Easy_04_MaxDepthNaryTree — Depth of a Target Node
     * Technique: the same recursive DFS descent used to compute overall max depth in
     * Easy_04_MaxDepthNaryTree, but instead of returning the deepest depth reached anywhere in
     * the tree, the DFS searches for one specific target value and reports the depth AT WHICH
     * it was found.
     *
     * Given the root of a binary tree and a target value guaranteed to exist exactly once,
     * return the depth of the node containing that value (the root has depth 1).
     *
     * Example:
     * Input: root = [3,9,20,null,null,15,7], target = 15
     * Output: 3
     * Explanation: 3 (depth 1) -> 20 (depth 2) -> 15 (depth 3).
     */
    public int depthOfTarget(TreeNode root, int target) {
        // TODO: Implement your solution here.
        return 0;
    }
}
