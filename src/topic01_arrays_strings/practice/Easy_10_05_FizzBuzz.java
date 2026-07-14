package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Easy_10_05_FizzBuzz {

    /**
     * Drill 5/5 for Easy_10_FizzBuzz — Extensible Four Rules
     * Technique: the fullest expression of the extensible design the original mentor
     * question asked about for Easy_10_FizzBuzz — FOUR simultaneous divisor/word rules
     * handled via a clean list/map of (divisor, word) pairs iterated in ascending-divisor
     * order, so that adding a fifth rule would be a one-line change (append one more pair),
     * not a restructuring of if-else branches.
     *
     * Given an integer n, return a List<String> (1-indexed, n entries) applying these rules
     * in ascending divisor order: 3 -> "Fizz", 5 -> "Buzz", 7 -> "Bang", 11 -> "Boom". For
     * each number i, concatenate the words of every rule whose divisor evenly divides i, in
     * ascending divisor order (e.g. divisible by 3, 5, and 7 -> "FizzBuzzBang"). If no rule
     * matches, the entry is String.valueOf(i).
     *
     * Example:
     * Input: n = 11
     * Output: ["1","2","Fizz","4","Buzz","Fizz","Bang","8","Fizz","Buzz","Boom"]
     * Explanation: 3,6,9 -> Fizz; 5,10 -> Buzz; 7 -> Bang; 11 -> Boom.
     */
    public List<String> fizzBuzzFourRules(int n) {
        // TODO: Implement your solution here. Use a clean extensible design (e.g. a
        // list or ordered map of (divisor, word) pairs iterated in order) so that adding
        // a fifth rule later would only require appending one more entry, not editing
        // conditional branches.
        return null;
    }
}
