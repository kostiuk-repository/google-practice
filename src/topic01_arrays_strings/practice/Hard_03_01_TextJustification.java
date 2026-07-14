package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Hard_03_01_TextJustification {

    /**
     * Drill 1/5 for Hard_03_TextJustification — Left Justify Only
     * Technique: greedy line packing — pack as many words as fit within maxWidth per
     * line, the same greedy step as the original problem — but the space-distribution
     * step is simplified to isolate packing from justification: every gap between words
     * gets exactly one space, and any remaining width is padded as trailing spaces at
     * the end of the line.
     *
     * Given an array of strings words and a width maxWidth, greedily pack as many words
     * as fit on each line (a single space between consecutive words on a line still
     * counts toward the width). After placing the words for a line with single spaces
     * between them, pad the line with trailing spaces so its total length is exactly
     * maxWidth. Return the resulting lines as a List&lt;String&gt;.
     *
     * Example:
     * Input: words = ["This", "is", "an", "example"], maxWidth = 12
     * Output:
     * [
     *    "This is an  ",
     *    "example     "
     * ]
     */
    public List<String> leftJustify(String[] words, int maxWidth) {
        // TODO: Implement your solution here.
        return null;
    }
}
