package topic11_recursion_backtracking.practice;

public class Easy_01_03_Fibonacci {

    /**
     * Drill 3/5 for Easy_01_Fibonacci — Count Recursive Calls for Naive Fibonacci
     * Technique: isolates the shape of the Fibonacci recursion TREE itself — instead of
     * computing fib(n), count how many total recursive calls a naive (unmemoized)
     * fib(n) implementation would make, using the exact same two-branch recurrence.
     *
     * Define countFibCalls(n) as the number of calls made by a naive recursive fib(n):
     * countFibCalls(0) = 1 and countFibCalls(1) = 1 (each is a single base-case call), and
     * countFibCalls(n) = 1 + countFibCalls(n-1) + countFibCalls(n-2) for n >= 2 (the call to
     * fib(n) itself, plus every call made while computing fib(n-1) and fib(n-2)).
     *
     * Example:
     * Input: n = 3
     * Output: 5
     * Explanation: countFibCalls(3) = 1 + countFibCalls(2) + countFibCalls(1)
     * = 1 + 3 + 1 = 5.
     */
    public int countFibCalls(int n) {
        // TODO: Implement your solution here.
        return 0;
    }
}
