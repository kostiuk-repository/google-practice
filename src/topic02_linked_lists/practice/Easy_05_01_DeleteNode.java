package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_05_01_DeleteNode {

    /**
     * Drill 1/5 for Easy_05_DeleteNode — Shift Value Only
     * Technique: isolates the COPY half of the value-copy trick used in Easy_05_DeleteNode,
     * without the pointer-skipping half — only the value is overwritten, no node is removed.
     *
     * Given a reference to a node (not the tail) in a singly linked list, overwrite that node's
     * value with the value of the next node. Do not remove any node from the list; only node.val
     * changes. This method returns nothing (void).
     *
     * Example:
     * Input: node = Node(5) (from list 4 -> 5 -> 1 -> 9)
     * Output: List becomes 4 -> 1 -> 1 -> 9 (node's value changed from 5 to 1; the node count is unchanged)
     */
    public void shiftValueOnly(ListNode node) {
        // TODO: Implement your solution here.
    }
}
