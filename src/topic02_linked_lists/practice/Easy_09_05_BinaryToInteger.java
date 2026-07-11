package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_09_05_BinaryToInteger {

    /**
     * Drill 5/5 for Easy_09_BinaryToInteger — Overflow-Safe Accumulate
     * Technique: capstone — extends the left-to-right accumulate of Easy_09_BinaryToInteger to
     * remain correct for arbitrarily long lists by reducing modulo 1_000_000_007 at every step,
     * instead of letting the accumulated value overflow a 32-bit int.
     *
     * Given head, a reference to a singly-linked list whose node values are 0 or 1 representing a
     * (potentially very long) binary number, most significant bit at head, return the decimal
     * value of the number MODULO 1,000,000,007, computed by applying the modulo reduction at
     * every step of the accumulation (never build the true, possibly astronomically large value).
     *
     * Example:
     * Input: head = [1,0,1]
     * Output: 5
     */
    public int getDecimalValueModulo(ListNode head) {
        // TODO: Implement your solution here.
        return 0;
    }
}
