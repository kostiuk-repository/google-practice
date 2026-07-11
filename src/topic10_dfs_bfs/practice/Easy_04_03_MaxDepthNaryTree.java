package topic10_dfs_bfs.practice;

import topic09_trees.TreeNode;

public class Easy_04_03_MaxDepthNaryTree {

    /**
     * Drill 3/5 for Easy_04_MaxDepthNaryTree — Count Total Nodes
     * Technique: the same DFS recursion shape as Easy_04_MaxDepthNaryTree
     * ("combine the results of the left and right subtree calls"), but the combinator changes
     * from "1 + max(left, right)" (depth) to "1 + left + right" (a node count).
     *
     * Given the root of a binary tree, return the total number of nodes in the tree, computed
     * with a DFS that mirrors the max-depth recursion.
     *
     * Example:
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 5
     */
    public int countNodes(TreeNode root) {
        // TODO: Implement your solution here.
        return 0;
    }
}
