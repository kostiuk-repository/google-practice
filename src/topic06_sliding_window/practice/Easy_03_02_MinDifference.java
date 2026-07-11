package topic06_sliding_window.practice;

import java.util.Arrays;

public class Easy_03_02_MinDifference {

    /**
     * Drill 2/5 for Easy_03_MinDifference — Starting Score of the Best Window
     * Technique: same sort-then-slide-fixed-window technique as Easy_03_MinDifference, but instead
     * of returning the minimum difference itself we track and return the LOWEST score of the
     * winning window (argmin location, not just the value).
     *
     * Given an integer array nums and an integer k, sort the array, slide a window of size k over
     * it, and return the smallest score belonging to the window that has the minimum difference
     * between its highest and lowest score. If there is a tie, return the smallest such value.
     *
     * Example:
     * Input: nums = [9,4,1,7], k = 2
     * Output: 7
     * Explanation: Sorted: [1,4,7,9]. Window diffs: [1,4]=3, [4,7]=3, [7,9]=2. The best window is
     * [7,9] with diff 2, whose lowest score is 7.
     */
    public int startOfBestWindow(int[] nums, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
