package topic08_binary_search.practice;

public class Easy_01_05_BinarySearch {

    /**
     * Drill 5/5 for Easy_01_BinarySearch — Search a Padded Array
     * Technique: capstone that extends the lo/hi narrowing to a search space of uncertain
     * effective size. The array is sorted ascending but its real length is unknown to you:
     * a valid prefix holds real data, followed by a suffix entirely padded with
     * Integer.MAX_VALUE. Treat any Integer.MAX_VALUE you land on as "too high" when deciding
     * which half to keep.
     *
     * Given a padded sorted array nums (real data followed by Integer.MAX_VALUE filler) and
     * a target value, return the index of target within the valid prefix using binary
     * search, or -1 if it is not present in the valid prefix.
     *
     * Example:
     * Input: nums = [1,3,5,7,9,Integer.MAX_VALUE,Integer.MAX_VALUE], target = 7
     * Output: 3
     */
    public int searchPaddedArray(int[] nums, int target) {
        // TODO: Implement your solution here.
        return -1;
    }
}
