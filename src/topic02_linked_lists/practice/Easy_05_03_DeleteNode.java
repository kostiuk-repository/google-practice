package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_05_03_DeleteNode {

    /**
     * Drill 3/5 for Easy_05_DeleteNode — Can This Node Use The Trick?
     * Technique: instead of performing the value-copy trick from Easy_05_DeleteNode, this drill
     * asks WHEN it is legal to use it — a validity/edge-case check on the same technique.
     *
     * Given a reference to a node in a singly linked list, return true if the value-copy deletion
     * trick (copying node.next's value into node, then skipping node.next) can be legally applied
     * to it — that is, node is not null AND node is not the tail (node.next != null). Return
     * false otherwise.
     *
     * Example:
     * Input: node = Node(9) (the tail of list 4 -> 5 -> 1 -> 9)
     * Output: false
     */
    public boolean canDeleteWithTrick(ListNode node) {
        // TODO: Implement your solution here.
        return false;
    }
}
