package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Hard_03_05_TextJustification {

    /**
     * Drill 5/5 for Hard_03_TextJustification — Minimum Two Spaces Between Words
     * Technique: same greedy line-packing and even-distribution-with-left-heavy-
     * remainder rule as the original problem, but the greedy "does the next word fit"
     * check must reserve at least 2 spaces per gap instead of 1, which changes how many
     * words fit on a line; the final distribution of any EXTRA leftover width beyond the
     * mandatory minimum still follows the same even-split, left-heavy-remainder rule as
     * the original.
     *
     * Given an array of strings words and a width maxWidth, format the text so each line
     * has exactly maxWidth characters and is fully justified, packing words greedily as
     * many as fit per line, EXCEPT that every line with more than one word must have at
     * least 2 spaces between any two adjacent words (so the greedy fit-check for the
     * next word must account for a minimum gap width of 2, not 1). Any width beyond the
     * mandatory minimum spaces is distributed as evenly as possible across the gaps,
     * with the leftmost gaps getting the extra space when it doesn't divide evenly. The
     * last line, and any line with only a single word, is left-justified with the
     * minimum single-word/last-line spacing (single word: pad trailing spaces; last
     * line: single space between words, then trailing padding), the same edge-case rules
     * as the original problem.
     *
     * Example:
     * Input: words = ["a", "bb", "ccc"], maxWidth = 10
     * Output:
     * ["a  bb  ccc"]
     * Explanation: "a" + "bb" + "ccc" = 6 chars, leaving 4 spaces across 2 gaps; each gap
     * needs at least 2, and 4 divides evenly as 2 and 2.
     */
    public List<String> justifyMinTwoSpaces(String[] words, int maxWidth) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
