package topic01_arrays_strings.practice;

public class Medium_05_05_StringIntegerAtoi {

    /**
     * Drill 5/5 for Medium_05_StringIntegerAtoi — Parse Hex Int
     * Technique: manual digit-by-digit accumulation loop, analogous to myAtoi's decimal
     * scan (index, sign, accumulated value) but base 16 instead of base 10, and reading a
     * fixed "0x" marker between the sign and the digits instead of jumping straight into
     * digit-scanning.
     *
     * Given a string s formatted like "0x1A" or "-0x1F": an optional leading '+' or '-'
     * sign, followed by the literal prefix "0x", followed by one or more hexadecimal digit
     * characters (0-9, A-F, a-f), parse it into its integer value using a manual
     * digit-by-digit accumulation loop (accumulator = accumulator * 16 + digitValue).
     * Return 0 if there are no valid hex digits after "0x" (or the "0x" prefix itself is
     * missing/malformed). You may assume the result always fits in a 32-bit int, so no
     * overflow clamp is needed.
     *
     * Example:
     * Input: s = "0x1A"
     * Output: 26
     *
     * Example 2:
     * Input: s = "-0x1F"
     * Output: -31
     */
    public int parseHexInt(String s) {
        // TODO: Implement your solution here.
        return 0;
    }
}
