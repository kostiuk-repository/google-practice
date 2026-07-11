package topic01_arrays_strings.practice;

public class Medium_05_StringIntegerAtoi {

    /**
     * Problem: String to Integer (atoi)
     * 
     * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed 
     * integer (similar to C/C++'s atoi function).
     * 
     * The algorithm for myAtoi(string s) is as follows:
     * 1. Read in and ignore any leading whitespace.
     * 2. Check if the next character (if not already at the end of the string) is '-' or '+'. 
     *    Read this character in if it is either. This determines if the final result is negative or positive. 
     *    Assume the result is positive if neither is present.
     * 3. Read in next the characters until the next non-digit character or the end of the input is reached. 
     *    The rest of the string is ignored.
     * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, 
     *    then the integer is 0. Change the sign as necessary (from Step 2).
     * 5. If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], 
     *    then clamp the integer so that it remains in the range. 
     *    Specifically, integers less than -2^31 should be clamped to -2^31, 
     *    and integers greater than 2^31 - 1 should be clamped to 2^31 - 1.
     * 6. Return the integer as the final result.
     * 
     * Example:
     * Input: s = "   -42"
     * Output: -42
     * 
     * Example 2:
     * Input: s = "4193 with words"
     * Output: 4193
     */
    public int myAtoi(String s) {
        // TODO: Implement your solution here.
        return 0;
    }

    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: How do you handle integer overflow while parsing digits one-by-one 
     * before the value actually overflows a 32-bit signed integer in Java? 
     * Hint: Think about checks using `Integer.MAX_VALUE / 10` and `Integer.MAX_VALUE % 10`.
     * 
     * Your Answer: 
     * 
     */
}
