package topic01_arrays_strings.practice;

public class Medium_05_02_StringIntegerAtoi {

    /**
     * Drill 2/5 for Medium_05_StringIntegerAtoi — Parse With Sign, No Overflow
     * Technique: manual left-to-right character scan maintaining explicit parser state
     * (index, sign, accumulated value) — same whitespace/sign handling as the original
     * myAtoi, but the overflow guard is deliberately dropped so the sign logic can be
     * practiced in isolation.
     *
     * Given a string s, skip any leading whitespace, then check for an optional single
     * leading '+' or '-' character (assume positive if absent), then read consecutive
     * digit characters until a non-digit or the end of the string, accumulating them into
     * an integer with the appropriate sign. Return 0 if no digits were read. You may
     * assume the final result always fits in a 32-bit int, so no overflow clamp is needed.
     *
     * Example:
     * Input: s = "   -42"
     * Output: -42
     *
     * Example 2:
     * Input: s = "+123abc"
     * Output: 123
     */
    public int parseWithSign(String s) {
        // TODO: Implement your solution here.
        return 0;
    }
}
