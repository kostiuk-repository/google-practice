package topic04_hash_tables.practice;

import java.util.HashSet;
import java.util.Set;

public class Easy_05_04_HappyNumber {

    /**
     * Drill 4/5 for Easy_05_HappyNumber — Happy Number In Base P (General Power)
     * Technique: same HashSet cycle-detection loop as Easy_05_HappyNumber, but the digit
     * transformation is generalized from "sum of SQUARES" to "sum of digits raised to a given
     * power p", parameterizing the exponent instead of hardcoding 2.
     *
     * Given a positive integer n and an integer power p (p >= 2), a number is "p-happy" if
     * repeatedly replacing it with the sum of each of its digits raised to the power p
     * eventually reaches 1. Return true if n is p-happy, and false if the process cycles
     * without ever reaching 1.
     *
     * Example:
     * Input: n = 19, p = 2
     * Output: true
     * Explanation: same process as the classic happy number check, with p = 2.
     */
    public boolean isPHappy(int n, int p) {
        // TODO: Implement your solution here.
        return false;
    }
}
