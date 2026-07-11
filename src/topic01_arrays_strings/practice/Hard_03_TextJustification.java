package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Hard_03_TextJustification {

    /**
     * Problem: Text Justification
     * 
     * Given an array of strings words and a width maxWidth, format the text such that 
     * each line has exactly maxWidth characters and is fully (left and right) justified.
     * 
     * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. 
     * Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
     * 
     * Extra spaces between words should be distributed as evenly as possible. If the number of spaces 
     * on a line does not divide evenly between words, the empty slots on the left will be assigned 
     * more spaces than the slots on the right.
     * 
     * For the last line of text, it should be left-justified, and no extra space is inserted between words.
     * 
     * Example:
     * Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
     * Output:
     * [
     *    "This    is    an",
     *    "example  of text",
     *    "justification.  "
     * ]
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
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
     * Mentor Question: Formatting a line requires handling three separate spacing cases:
     * 1. A line with only a single word.
     * 2. A regular line with multiple words (fully justified).
     * 3. The last line of the text (left justified).
     * 
     * Explain how your algorithm determines the number of spaces to insert between words 
     * in each of these three cases.
     * 
     * Your Answer: 
     * 
     */
}
