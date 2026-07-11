package topic01_arrays_strings.practice;

public class Hard_01_02_FirstMissingPositive {

    /**
     * Drill 2/5 for Hard_01_FirstMissingPositive — First Duplicate Positive
     * Technique: cyclic sort / index placement — attempt to swap each value x
     * (1 <= x <= n) into its home index x-1; when a swap discovers that the home index
     * x-1 already holds x, that value is a duplicate. A final scan reports the duplicate
     * that ended up occupying the leftmost index.
     *
     * Given an array nums of positive integers of length n, find the first (leftmost by
     * final resting position after placement) duplicate positive integer in the range
     * [1, n], using the same in-place swap/placement technique as the original problem, in
     * O(N) time and O(1) extra space. Return -1 if there is no duplicate in that range.
     *
     * Example:
     * Input: nums = [1,2,2,3]
     * Output: 2
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: -1
     */
    public int firstDuplicatePositive(int[] nums) {
        // TODO: Implement your solution here in O(N) time and O(1) space.
        return -1;
    }
}
