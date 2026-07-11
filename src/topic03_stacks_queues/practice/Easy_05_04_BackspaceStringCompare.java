package topic03_stacks_queues.practice;

public class Easy_05_04_BackspaceStringCompare {

    /**
     * Drill 4/5 for Easy_05_BackspaceStringCompare — Optimal O(1) Space Compare
     * Technique: explicitly implement the O(1)-space two-pointer-from-the-end approach that
     * Easy_05_BackspaceStringCompare's challenge hints at — walk both strings from their
     * last character backwards, using a local counter (not a stack) to skip characters that
     * get backspaced away, comparing surviving characters one pair at a time.
     *
     * Given two strings s and t, return true if they are equal when both are typed into
     * empty text editors ('#' means backspace). You must NOT use a Deque/Stack or build any
     * intermediate string — use two indices walking backwards from the end of each string
     * and O(1) extra space.
     *
     * Example:
     * Input: s = "ab#c", t = "ad#c"
     * Output: true
     * Explanation: Both s and t become "ac" when typed, but you must verify this by
     * walking backwards with counters instead of building "ac" explicitly.
     */
    public boolean backspaceCompareOptimal(String s, String t) {
        // TODO: Implement your solution here.
        return false;
    }
}
