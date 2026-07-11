package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_01_05_RemoveElements {

    /**
     * Drill 5/5 for Easy_01_RemoveElements — Collapse Consecutive Duplicates
     * Technique: dummy sentinel + prev/curr traversal, but the removal condition is now DYNAMIC —
     * a node is deleted when its value equals the value of the last node that survived, instead
     * of a fixed target value like in Easy_01_RemoveElements.
     *
     * Given the head of a linked list (not necessarily sorted), remove every node whose value is
     * equal to the value of its immediately preceding surviving node, so that no two adjacent
     * nodes in the result share the same value. Return the new head.
     *
     * Example:
     * Input: head = [1,1,2,2,2,3,1,1]
     * Output: [1,2,3,1]
     * Explanation: Each run of equal adjacent values collapses to its first occurrence.
     */
    public ListNode collapseConsecutiveDuplicates(ListNode head) {
        // TODO: Implement your solution here.
        return null;
    }
}
