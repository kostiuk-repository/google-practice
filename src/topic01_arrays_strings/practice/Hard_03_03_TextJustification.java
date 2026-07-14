package topic01_arrays_strings.practice;

import java.util.List;

public class Hard_03_03_TextJustification {

    /**
     * Drill 3/5 for Hard_03_TextJustification — Distribute Spaces Given Line
     * Technique: isolates just the space-distribution math from the original problem,
     * without the greedy packing step. Given a line's words already decided, extra
     * spaces are divided as evenly as possible between the gaps; if the total leftover
     * width does not divide evenly across the gaps, the leftmost gaps each get one extra
     * space than the rightmost gaps.
     *
     * Given a single line already packed as a List&lt;String&gt; of words (guaranteed
     * this is NOT the last line of the overall text, and guaranteed to contain more than
     * one word) and a target width maxWidth, return the single justified line as a
     * String using the same space-distribution rule as the original fullJustify: spaces
     * are divided as evenly as possible among the gaps between words, and any remainder
     * slots on the left are assigned one extra space each.
     *
     * Example:
     * Input: words = ["This", "is", "an"], maxWidth = 16
     * Output: "This    is    an"
     * Explanation: 3 words leave 2 gaps and 16 - 8 = 8 extra spaces; 8 / 2 = 4 spaces per
     * gap exactly, so both gaps get 4 spaces.
     */
    public String justifyLine(List<String> words, int maxWidth) {
        // TODO: Implement your solution here.
        return null;
    }
}
