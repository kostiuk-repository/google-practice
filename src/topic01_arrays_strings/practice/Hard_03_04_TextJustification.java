package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Hard_03_04_TextJustification {

    /**
     * Drill 4/5 for Hard_03_TextJustification — Center Justify
     * Technique: greedy line packing — same greedy "pack as many words as fit" step as
     * the original problem, using single spaces between words, but the leftover width is
     * split between BOTH sides instead of only the right (original) or only the left:
     * leftover width is divided as evenly as possible into left-padding and
     * right-padding, with the extra character (when leftover is odd) going to the right
     * side.
     *
     * Given an array of strings words and a width maxWidth, greedily pack as many words
     * as fit on each line with a single space between consecutive words. Center the
     * resulting text within maxWidth: split the leftover width into left-padding and
     * right-padding as evenly as possible, giving any extra single space (when the
     * leftover width is odd) to the right side.
     *
     * Example:
     * Input: words = ["This", "is", "an"], maxWidth = 13
     * Output:
     * ["  This is an "]
     * Explanation: "This is an" is 10 chars, leftover = 3, split as 1 left / 2 right.
     */
    public List<String> centerJustify(String[] words, int maxWidth) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
