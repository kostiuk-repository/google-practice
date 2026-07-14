package topic04_hash_tables.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Easy_05_02_HappyNumber {

    /**
     * Drill 2/5 for Easy_05_HappyNumber — Find the Cycle
     * Technique: same HashSet-of-seen-values cycle detection as Easy_05_HappyNumber, but
     * instead of returning a boolean, extract and return the actual cycle of numbers the
     * process gets stuck repeating.
     *
     * Given a positive integer n that is NOT a happy number, run the "sum of squares of
     * digits" process repeatedly and return the list of numbers that make up the infinite
     * cycle, starting from the first number that repeats, in the order they occur. If n turns
     * out to be happy, return an empty list.
     *
     * Example:
     * Input: n = 4
     * Output: [4, 16, 37, 58, 89, 145, 42, 20]
     * Explanation: 4 eventually loops back to 4 through this sequence of values.
     */
    public List<Integer> findCycle(int n) {
        // TODO: Implement your solution here.
        return null;
    }
}
