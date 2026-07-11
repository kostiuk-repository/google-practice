package topic01_arrays_strings.practice;

public class Medium_05_03_StringIntegerAtoi {

    /**
     * Drill 3/5 for Medium_05_StringIntegerAtoi — Parse With Byte Clamp
     * Technique: manual left-to-right character scan with explicit parser state, plus an
     * overflow guard checked BEFORE each multiply-and-add step — same shape as the
     * original myAtoi's MAX_VALUE/10 and MAX_VALUE%10 guard, but re-derived against the
     * much smaller 8-bit signed byte range instead of the 32-bit int range.
     *
     * Given a string s, parse it the same way as myAtoi: skip leading whitespace, read an
     * optional single leading '+' or '-', then read consecutive digit characters until a
     * non-digit or the end of the string, accumulating them into an integer. If the
     * resulting value would fall outside the 8-bit signed byte range
     * [Byte.MIN_VALUE, Byte.MAX_VALUE] = [-128, 127], clamp it to that range instead
     * (use Byte.MAX_VALUE / Byte.MIN_VALUE as the reference constants for the guard, but
     * return an int). Return 0 if no digits were read.
     *
     * Example:
     * Input: s = "200"
     * Output: 127
     * Explanation: 200 exceeds Byte.MAX_VALUE (127), so it is clamped to 127.
     *
     * Example 2:
     * Input: s = "-200"
     * Output: -128
     * Explanation: -200 is below Byte.MIN_VALUE (-128), so it is clamped to -128.
     */
    public int parseByteClamped(String s) {
        // TODO: Implement your solution here.
        return 0;
    }
}
