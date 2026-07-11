package topic03_stacks_queues.practice;

public class Easy_03_02_MakeStringGreat {

    /**
     * Drill 2/5 for Easy_03_MakeStringGreat — Make Digit String Great
     * Technique: same adjacent-cancellation stack as Easy_03_MakeStringGreat, but the
     * "bad pair" condition is generalized from case-flipped letters to complementary
     * digits (two adjacent digits cancel if they sum to 9, e.g. '3' and '6').
     *
     * Given a string digits consisting only of characters '0'-'9', repeatedly remove any
     * two adjacent digits whose numeric values sum to 9, until no such pair remains.
     * Return the final string.
     *
     * Example:
     * Input: digits = "1236"
     * Output: "12"
     * Explanation: "3" and "6" sum to 9 and are adjacent, so removing them leaves "12",
     * which has no adjacent pair summing to 9, so the final string is "12".
     *
     * Example 2:
     * Input: digits = "3546"
     * Output: ""
     * Explanation: "5" and "4" sum to 9 and are adjacent, so removing them leaves "36";
     * then "3" and "6" also sum to 9 and are now adjacent, so removing them leaves the
     * empty string. This cascading is why a stack (not a single linear pass) is needed.
     */
    public String makeGoodDigits(String digits) {
        // TODO: Implement your solution here.
        return "";
    }
}
