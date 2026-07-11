package topic01_arrays_strings.practice;

public class Easy_01_03_HighestAltitude {

    /**
     * Drill 3/5 for Easy_01_HighestAltitude — Below Zero
     * Technique: running accumulator, but now track whether it ever drops below the
     * start value instead of tracking the maximum (mirror image of Easy_01).
     *
     * You start with a bank balance of 0. You are given an array of operations where
     * operations[i] is a deposit (positive) or withdrawal (negative). Return true if the
     * balance ever goes below zero at any point during the operations, otherwise false.
     *
     * Example:
     * Input: operations = [10,-2,-8,5]
     * Output: false
     * Explanation: Balances: 10, 8, 0, 5. Never goes negative (0 is not below zero).
     *
     * Example 2:
     * Input: operations = [10,-15,5]
     * Output: true
     * Explanation: Balances: 10, -5, 0. It goes negative after the second operation.
     */
    public boolean belowZero(int[] operations) {
        // TODO: Implement your solution here.
        return false;
    }
}
