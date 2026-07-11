package topic01_arrays_strings.practice;

public class Easy_08_05_LargestNumberTwice {

    /**
     * Drill 5/5 for Easy_08_LargestNumberTwice — Top Three Values
     * Technique: extend the two-tracker idea (largest, second-largest) from
     * Easy_08_LargestNumberTwice into THREE running trackers (largest, second-largest,
     * third-largest) updated together in a single pass, considering only distinct values.
     *
     * Given an integer array nums, track the three largest DISTINCT values in a single pass
     * and return them as an int[3] sorted in descending order. If the array contains fewer
     * than 3 distinct values, pad the remaining slots (from the end) with Integer.MIN_VALUE.
     *
     * Example:
     * Input: nums = [4,2,8,8,5]
     * Output: [8,5,4]
     * Explanation: distinct values are 8, 5, 4, 2 — the top three distinct values are 8, 5, 4.
     *
     * Example 2:
     * Input: nums = [7,7]
     * Output: [7,-2147483648,-2147483648]
     * Explanation: only one distinct value (7) exists, so the remaining two slots are padded
     * with Integer.MIN_VALUE.
     */
    public int[] topThreeValues(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
