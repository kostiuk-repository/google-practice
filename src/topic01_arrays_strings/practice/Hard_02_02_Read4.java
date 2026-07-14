package topic01_arrays_strings.practice;

class Reader4Stub02 {
    // Fake implementation of read4 for compilation/IDE reference.
    // In actual system, this is API provided by the platform.
    int read4(char[] buf4) {
        return 0;
    }
}

public class Hard_02_02_Read4 extends Reader4Stub02 {

    private char[] internalBuffer = new char[4];
    private int internalPtr = 0;
    private int internalCount = 0;

    /**
     * Drill 2/5 for Hard_02_Read4 — Peek Next Character
     * Technique: same internal-buffer pattern as the original Hard_02_Read4
     * (internalBuffer/internalPtr/internalCount), used to look at the next character
     * from the file WITHOUT consuming it — so a leftover buffer is needed even for a
     * single call, since read4 always reads 4 characters at once but peek() only wants
     * to expose one of them.
     *
     * Using the read4 method, implement peek() that returns the next character from the
     * file without advancing past it: a subsequent call to peek() or read()-style
     * consumption should still see that same character as the next one available.
     * Return '\0' if the file has no more characters.
     *
     * Example:
     * File = "abc"
     * peek() returns 'a'
     * peek() again (called right after) still returns 'a'
     */
    public char peek() {
        // TODO: Implement your solution here.
        return 0;
    }
}
