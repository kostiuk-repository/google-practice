package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Easy_10_02_FizzBuzz {

    /**
     * Drill 2/5 for Easy_10_FizzBuzz — FizzBuzz Bang
     * Technique: iterate 1..n, but instead of hardcoding checks for 3 and 5 like
     * Easy_10_FizzBuzz, add a third rule (7 -> "Bang") and implement this using an
     * EXTENSIBLE approach — e.g. a list of (divisor, word) pairs iterated in order and
     * concatenated on match — rather than a long if-else chain. This is exactly the design
     * the original mentor question asked about: adding a new rule should not require
     * touching existing conditional logic, just appending one more (divisor, word) entry.
     *
     * Given an integer n, return a List<String> (1-indexed, n entries) where for each number
     * i: if i is divisible by 3, append "Fizz"; if divisible by 5, append "Buzz"; if
     * divisible by 7, append "Bang" (in that ascending-divisor order, concatenated). If i is
     * divisible by none of 3, 5, 7, the entry is String.valueOf(i).
     *
     * Example:
     * Input: n = 21
     * Output (entries at i=15 and i=21 shown): i=15 -> "FizzBuzz", i=21 -> "FizzBang", i=105 would be "FizzBuzzBang" (out of range here)
     * Explanation: 105 = 3*5*7 is divisible by all three, so it would map to "FizzBuzzBang".
     */
    public List<String> fizzBuzzBang(int n) {
        // TODO: Implement your solution here. Use an extensible list of (divisor, word)
        // pairs iterated in order rather than a big if-else chain, so adding a new rule
        // later is a one-line change.
        return null;
    }
}
