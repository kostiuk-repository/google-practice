package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Hard_01_03_FirstMissingPositive {

    /**
     * Drill 3/5 for Hard_01_FirstMissingPositive — All Missing Positives
     * Technique: cyclic sort / index placement — same swap-into-home-index-x-1 pass as
     * the original problem, but instead of stopping at the FIRST index i where
     * nums[i] != i+1, the final scan collects EVERY such index into the result list.
     *
     * Given an array nums of length n, return a List&lt;Integer&gt; of ALL missing
     * positive integers in the range [1, n] (not just the smallest one), using the same
     * swap/placement technique as the original problem, in O(N) time and O(1) extra space
     * besides the output list.
     *
     * Example:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [5,6]
     * Explanation: n = 8, and 5 and 6 are the positive integers in [1,8] missing from nums.
     */
    public List<Integer> allMissingPositives(int[] nums) {
        // TODO: Implement your solution here in O(N) time and O(1) extra space.
        return new ArrayList<>();
    }
}
