package topic01_arrays_strings.practice;

public class Medium_05_01_StringIntegerAtoi {

    /**
     * Drill 1/5 for Medium_05_StringIntegerAtoi — Parse Non-Negative Integer
     * Technique: manual left-to-right character scan maintaining explicit parser state
     * (index, accumulated value) — the simplest slice of the original myAtoi loop, with
     * no sign handling and no overflow guard.
     *
     * Given a string s, skip any leading whitespace characters, then read consecutive
     * digit characters ('0'-'9') and accumulate them into a non-negative integer, stopping
     * at the first non-digit character or the end of the string. Return 0 if no digits were
     * found before a non-digit character (or the string is empty/all whitespace). You may
     * assume the resulting value always fits in a 32-bit int.
     *
     * Example:
     * Input: s = "   123abc"
     * Output: 123
     *
     * Example 2:
     * Input: s = "abc"
     * Output: 0
     */
    public int parseNonNegativeInt(String s) {
        // TODO: Implement your solution here.
        return 0;
    }
}
