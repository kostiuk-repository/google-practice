package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_05_05_DeleteNode {

    /**
     * Drill 5/5 for Easy_05_DeleteNode — Merge Node With Next
     * Technique: capstone — combines the value-copy trick from Easy_05_DeleteNode with an
     * arithmetic operation: instead of simply overwriting node's value, combine node and its
     * successor's values before deleting the successor with the same trick.
     *
     * Given a reference to a node (not the tail) in a singly linked list, collapse it with its
     * next node: set node.val to the SUM of node.val and node.next.val, then delete node.next
     * using the value-copy trick technique (skip it, no predecessor access needed).
     *
     * Example:
     * Input: node = Node(5) (from list 4 -> 5 -> 1 -> 9)
     * Output: List becomes 4 -> 6 -> 9 (node's value becomes 5+1=6, and the node holding 1 is removed)
     */
    public void mergeNodeWithNext(ListNode node) {
        // TODO: Implement your solution here.
    }
}
