package topic06_sliding_window.practice;

public class Easy_05_01_MaxVowels {

    /**
     * Drill 1/5 for Easy_05_MaxVowels — Count All-Vowel Windows
     * Technique: fixed-size window with a running vowel counter (add entering char's vowel-ness,
     * subtract leaving char's) as in Easy_05_MaxVowels, but the predicate we test per window is
     * "are ALL k characters vowels" rather than "how many are vowels."
     *
     * Given a string s and an integer k, return the number of contiguous substrings of length k
     * in which every character is a vowel (a, e, i, o, u).
     *
     * Example:
     * Input: s = "aabaee", k = 2
     * Output: 3
     * Explanation: Windows: "aa" (all vowels), "ab" (no), "ba" (no), "ae" (all vowels),
     * "ee" (all vowels). 3 windows qualify.
     */
    public int countAllVowelWindows(String s, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
