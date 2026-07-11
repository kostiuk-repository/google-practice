package topic01_arrays_strings.practice;

class Reader4Stub04 {
    // Fake implementation of read4 for compilation/IDE reference.
    // In actual system, this is API provided by the platform.
    int read4(char[] buf4) {
        return 0;
    }
}

public class Hard_02_04_Read4 extends Reader4Stub04 {

    private char[] internalBuffer = new char[4];
    private int internalPtr = 0;
    private int internalCount = 0;

    /**
     * Drill 4/5 for Hard_02_Read4 — Count Vowels Read
     * Technique: same internal-buffer pattern as the original Hard_02_Read4
     * (internalBuffer/internalPtr/internalCount) and the same "read exactly n
     * characters, buffering read4's overflow" loop as read(), but the characters are
     * consumed internally to compute a count instead of being copied out to a
     * caller-supplied buffer.
     *
     * Using the read4 method, implement countVowels(int n) that reads exactly n
     * characters from the file (using the same buffering approach as read(); assume the
     * file has at least n characters, all lowercase letters) and returns how many of
     * those n characters are vowels ('a', 'e', 'i', 'o', 'u'), without exposing the raw
     * characters to the caller.
     *
     * Example:
     * File = "leetcode"
     * countVowels(8) returns 4
     * Explanation: the vowels in "leetcode" are e, e, o, e.
     */
    public int countVowels(int n) {
        // TODO: Implement your solution here.
        return 0;
    }
}
