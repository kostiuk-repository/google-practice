package topic11_recursion_backtracking.practice;

public class Easy_01_05_Fibonacci {

    /**
     * Drill 5/5 for Easy_01_Fibonacci — House Robber (Capstone)
     * Technique: capstone that extends the two-term recurrence into a maximization
     * decision: rob(i) = max(rob(i-1), rob(i-2) + nums[i]) has the exact same
     * "depends on the previous two states" shape as Fibonacci, now driven by an input
     * array and combined with a max() choice at every step.
     *
     * You are a robber planning to rob houses along a street, where nums[i] is the amount
     * of money in house i. You cannot rob two adjacent houses (it triggers an alarm).
     * Return the maximum amount of money you can rob without robbing two adjacent houses.
     *
     * Example:
     * Input: nums = [2,7,9,3,1]
     * Output: 12
     * Explanation: Rob house 0 (2), house 2 (9), and house 4 (1): 2 + 9 + 1 = 12.
     */
    public int rob(int[] nums) {
        // TODO: Implement your solution here.
        return 0;
    }
}
