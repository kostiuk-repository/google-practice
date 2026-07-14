package topic09_trees.practice;

import java.util.List;
import java.util.ArrayList;
import topic09_trees.TreeNode;

public class Easy_06_05_DiameterOfTree {

    /**
     * Drill 5/5 for Easy_06_DiameterOfTree — Longest Path Node Values
     * Technique: capstone — the same post-order height recursion used by
     * Easy_06_DiameterOfTree to find the diameter LENGTH, extended so each recursive call
     * also returns the actual longest downward path of node values from that node,
     * letting the parent reconstruct the full winning path instead of just its length.
     *
     * Given the root of a binary tree, return the node VALUES that form the longest path
     * between any two nodes in the tree (the diameter path), ordered from one endpoint to
     * the other.
     *
     * Example:
     * Input: root = [1,2,3,4,5]
     * Output: [4,2,1,3]  (or [4,2,5], both length-4/length-3 paths are valid answers when
     * tied for longest — return any one longest path)
     * Explanation: the path 4 -> 2 -> 1 -> 3 has 3 edges, the longest in this tree.
     */
    public List<Integer> longestPathValues(TreeNode root) {
        // TODO: Implement your solution here.
        return null;
    }
}
