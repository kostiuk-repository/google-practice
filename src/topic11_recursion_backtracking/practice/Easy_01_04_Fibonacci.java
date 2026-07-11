package topic11_recursion_backtracking.practice;

public class Easy_01_04_Fibonacci {

    /**
     * Drill 4/5 for Easy_01_Fibonacci — Nth Fibonacci Number Modulo 1_000_000_007
     * Technique: same recurrence f(n) = f(n-1) + f(n-2), combined with a second concept —
     * modular arithmetic applied at every addition — which is required once n grows large
     * enough (up to 100000) that memoization is mandatory and raw values would overflow.
     *
     * Given an integer n (0 <= n <= 100000), return the nth Fibonacci number modulo
     * 1_000_000_007. f(0) = 0, f(1) = 1, f(n) = f(n-1) + f(n-2) for n >= 2. Use recursion
     * with memoization so the solution runs in O(n) instead of exponential time, and apply
     * the modulo after every addition to keep intermediate values bounded.
     *
     * Example:
     * Input: n = 10
     * Output: 55
     */
    public int fibMod(int n) {
        // TODO: Implement your solution here.
        return 0;
    }
}
