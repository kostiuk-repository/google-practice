package topic01_arrays_strings.practice;

public class Hard_01_01_FirstMissingPositive {

    /**
     * Drill 1/5 for Hard_01_FirstMissingPositive — Contains All One To N
     * Technique: cyclic sort / index placement — use the array itself as an implicit hash
     * set by swapping each value x (1 <= x <= n) into its "home" index x-1, then a final
     * scan checks whether every index i now holds the value i+1.
     *
     * Given an array nums of length n, return true if it contains every integer from 1 to
     * n exactly once, in any order (the array may also contain values outside that range,
     * or duplicates, which should make the answer false). Solve it in O(N) time and O(1)
     * extra space using the same swap-into-place technique as the original problem.
     *
     * Example:
     * Input: nums = [3,1,2]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,4]
     * Output: false
     * Explanation: n = 3, but 4 is outside [1,3] and 3 is missing.
     */
    public boolean containsAllOneToN(int[] nums) {
        // TODO: Implement your solution here in O(N) time and O(1) space.
        return false;
    }
}
