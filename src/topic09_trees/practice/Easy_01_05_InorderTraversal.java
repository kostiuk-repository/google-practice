package topic09_trees.practice;

import java.util.List;
import java.util.ArrayList;
import topic09_trees.TreeNode;

public class Easy_01_05_InorderTraversal {

    /**
     * Drill 5/5 for Easy_01_InorderTraversal — Leaf Values Left To Right
     * Technique: capstone — run the same left-root-right recursion as
     * Easy_01_InorderTraversal, but only append a node's value to the result when it
     * satisfies a filter predicate (node is a leaf), combining the traversal shape with
     * a selective-collection condition evaluated at each visit.
     *
     * Given the root of a binary tree, return the values of all its LEAF nodes
     * (nodes with no children), collected in left-to-right order.
     *
     * Example:
     * Input: root = [1,2,3,4,5]   (2 -> children 4,5; 3 has no children)
     * Output: [4,5,3]
     */
    public List<Integer> leafValuesInOrder(TreeNode root) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
