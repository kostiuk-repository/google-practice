package topic01_arrays_strings.practice;

public class Easy_05_03_ReplaceElements {

    /**
     * Drill 3/5 for Easy_05_ReplaceElements — Diff From Max Right
     * Technique: right-to-left suffix sweep with a running max aggregate, but
     * instead of overwriting each element with the aggregate directly, store
     * the DIFFERENCE between the element and the aggregate.
     *
     * Given an array arr, replace every element with (element - greatest
     * element among the elements to its right), and replace the last element
     * with -1. Return the modified array.
     *
     * Example:
     * Input: arr = [17,18,5,4,6,1]
     * Output: [-1,12,-1,-2,5,-1]
     * Explanation: The greatest-to-the-right values are [18,6,6,6,1,-1], so
     * 17-18=-1, 18-6=12, 5-6=-1, 4-6=-2, 6-1=5, and the last element is fixed
     * at -1.
     */
    public int[] diffFromMaxRight(int[] arr) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
