package topic01_arrays_strings.practice;

public class Easy_05_05_ReplaceElements {

    /**
     * Drill 5/5 for Easy_05_ReplaceElements — Suffix Max Inclusive
     * Technique: right-to-left suffix sweep with a running max aggregate, but
     * the aggregate is updated BEFORE writing the result, so each element
     * includes itself in the comparison (no -1 special case for the last
     * element).
     *
     * Given an array arr, replace every element with the greatest element
     * from itself to the end of the array, inclusive. Return the modified
     * array. Unlike the original problem, the last element replaces itself
     * with itself (not -1), since it is trivially the max of a one-element
     * range.
     *
     * Example:
     * Input: arr = [17,18,5,4,6,1]
     * Output: [18,18,6,6,6,1]
     */
    public int[] suffixMaxInclusive(int[] arr) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
