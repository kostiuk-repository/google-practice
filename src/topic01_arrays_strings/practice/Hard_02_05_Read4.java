package topic01_arrays_strings.practice;

class Reader4Stub05 {
    // Fake implementation of read4 for compilation/IDE reference.
    // In actual system, this is API provided by the platform.
    int read4(char[] buf4) {
        return 0;
    }
}

public class Hard_02_05_Read4 extends Reader4Stub05 {

    private char[] internalBuffer = new char[4];
    private int internalPtr = 0;
    private int internalCount = 0;

    /**
     * Drill 5/5 for Hard_02_Read4 — Read With Unread
     * Technique: same internal-buffer pattern as the original Hard_02_Read4
     * (internalBuffer/internalPtr/internalCount) for read(), PLUS a second kind of
     * "leftover" state: characters already handed to the caller by the most recent
     * read() call can be pushed back into a pending queue by unread(), so the next
     * read() call serves them again before pulling any new data from read4.
     *
     * Using the read4 method, implement read(char[] buf, int n) the same way as in the
     * original problem, and additionally implement unread(int m) that pushes back the
     * last m characters returned by the most recent read() call (m must be less than or
     * equal to n from that call), so that the next call to read() returns those m
     * characters again before continuing with new data from the file.
     *
     * Example:
     * File = "abcde"
     * read(buf, 3) returns 3, buf = ['a','b','c']
     * unread(2)
     * read(buf, 3) returns 3, buf = ['b','c','d']
     */
    public int read(char[] buf, int n) {
        // TODO: Implement your solution here.
        return 0;
    }

    public void unread(int m) {
        // TODO: Implement your solution here.
    }
}
