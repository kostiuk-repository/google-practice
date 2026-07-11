package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_03_04_LinkedListCycle {

    /**
     * Drill 4/5 for Easy_03_LinkedListCycle — Do Mismatched Speeds Ever Meet?
     * Technique: tests WHY the 2x/1x speed ratio matters in Easy_03_LinkedListCycle by using a
     * different ratio — slow moves 1 step at a time, fast moves 3 steps at a time — on a list
     * that is guaranteed to be ACYCLIC (has a proper null-terminated end).
     *
     * Given the head of an acyclic singly linked list, simulate a slow pointer advancing 1 node
     * per step and a fast pointer advancing 3 nodes per step, both starting at head. Return true
     * if they ever land on the exact same node before fast runs off the end, false otherwise.
     *
     * Example:
     * Input: head = [1,2,3,4,5,6,7]
     * Output: false
     * Explanation: On an acyclic list, pointers moving at different speeds only ever diverge —
     * they can never "lap" each other because there is no loop to bring them back together.
     */
    public boolean fastSlowMeetIfSpeedThree(ListNode head) {
        // TODO: Implement your solution here.
        return false;
    }
}
