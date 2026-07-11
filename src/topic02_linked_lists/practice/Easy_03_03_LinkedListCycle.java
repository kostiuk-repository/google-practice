package topic02_linked_lists.practice;

public class Easy_03_03_LinkedListCycle {

    /**
     * Drill 3/5 for Easy_03_LinkedListCycle — Cycle In A Functional Graph
     * Technique: the same slow/fast (1x/2x) pointer idea from Easy_03_LinkedListCycle, but applied
     * to a functional graph encoded as an array instead of ListNode objects — "next" is simulated
     * by jumping to index next[i] rather than following a .next reference.
     *
     * You are given an integer array next where next[i] is the index of the node reached by
     * following the "pointer" out of node i (analogous to node.next in a linked list). Starting
     * from index 0 and repeatedly jumping via next[i], determine whether this process enters a
     * cycle. Return true if a cycle exists, false otherwise.
     *
     * Example:
     * Input: next = [1,2,3,1]
     * Output: true
     * Explanation: 0 -> 1 -> 2 -> 3 -> 1 -> 2 -> 3 -> ... loops forever starting at index 1.
     */
    public boolean hasFunctionalGraphCycle(int[] next) {
        // TODO: Implement your solution here.
        return false;
    }
}
