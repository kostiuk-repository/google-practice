package topic09_trees.practice;

import java.util.Deque;
import java.util.ArrayDeque;
import topic09_trees.TreeNode;

public class Easy_03_05_SymmetricTree {

    /**
     * Drill 5/5 for Easy_03_SymmetricTree — Iterative Symmetry Check
     * Technique: capstone — the same mirror-pair comparison performed by
     * Easy_03_SymmetricTree, but the recursive call stack is replaced by an explicit
     * Deque: enqueue root.left and root.right, then repeatedly dequeue two nodes at a
     * time and enqueue their children in mirrored order.
     *
     * Given the root of a binary tree, return true if it is symmetric around its center,
     * implemented ITERATIVELY (no recursion) using a stack or queue holding node pairs.
     *
     * Example:
     * Input: root = [1,2,2,3,4,4,3]
     * Output: true
     */
    public boolean isSymmetricIterative(TreeNode root) {
        // TODO: Implement your solution here.
        return false;
    }
}
