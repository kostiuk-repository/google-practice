package topic03_stacks_queues.practice;

public class Easy_05_03_BackspaceStringCompare {

    /**
     * Drill 3/5 for Easy_05_BackspaceStringCompare — Forward-Delete Compare
     * Technique: mirror of Easy_05_BackspaceStringCompare's erase direction — instead of
     * '#' deleting the PREVIOUS character already typed (backspace, which a stack handles
     * naturally by popping), '*' cancels the very NEXT real character that would otherwise
     * be typed (forward-delete), so the simulation must look ahead instead of behind.
     *
     * Given two strings s and t where every '*' cancels the single real character
     * immediately following it in the same string (that character is never "typed", and a
     * trailing '*' with nothing after it does nothing), return true if s and t produce the
     * same final text.
     *
     * Example:
     * Input: s = "ab*c", t = "ab"
     * Output: true
     * Explanation: s types 'a', then 'b', then '*' cancels the 'c' that follows it, so the
     * final text is "ab", which matches t exactly.
     */
    public boolean forwardDeleteCompare(String s, String t) {
        // TODO: Implement your solution here.
        return false;
    }
}
