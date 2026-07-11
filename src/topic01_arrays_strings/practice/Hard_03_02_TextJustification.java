package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Hard_03_02_TextJustification {

    /**
     * Drill 2/5 for Hard_03_TextJustification — Right Justify
     * Technique: greedy line packing — same greedy "pack as many words as fit" step as
     * the original problem, using single spaces between words, but the leftover width is
     * placed on the OPPOSITE side of the original's padding: instead of distributing it
     * as trailing/internal padding, all leftover width becomes LEADING spaces before the
     * words, so each line's text ends flush with the right edge (maxWidth).
     *
     * Given an array of strings words and a width maxWidth, greedily pack as many words
     * as fit on each line with a single space between consecutive words. Pad the
     * REMAINING width as leading spaces before the first word of the line, so every line
     * is exactly maxWidth characters long and right-justified.
     *
     * Example:
     * Input: words = ["This", "is", "an", "example"], maxWidth = 12
     * Output:
     * [
     *    "  This is an",
     *    "     example"
     * ]
     */
    public List<String> rightJustify(String[] words, int maxWidth) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
