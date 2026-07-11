package topic01_arrays_strings.practice;

class Reader4Stub03 {
    // Fake implementation of read4 for compilation/IDE reference.
    // In actual system, this is API provided by the platform.
    int read4(char[] buf4) {
        return 0;
    }
}

public class Hard_02_03_Read4 extends Reader4Stub03 {

    private char[] internalBuffer = new char[4];
    private int internalPtr = 0;
    private int internalCount = 0;

    /**
     * Drill 3/5 for Hard_02_Read4 — Read Line
     * Technique: same internal-buffer pattern as the original Hard_02_Read4
     * (internalBuffer/internalPtr/internalCount), except the stopping condition is no
     * longer "read exactly n characters" but "read until a newline character or EOF is
     * seen" — characters read past the newline (read4 over-reads in chunks of 4) must be
     * buffered for the next call to readLine().
     *
     * Using the read4 method, implement readLine() that reads and returns, as a String,
     * all characters up to (but not including) the next newline character '\n', or up to
     * end of file if read4 returns 0 before a newline is found. Any characters read past
     * the newline must be preserved in the internal buffer so the next call to
     * readLine() picks up where this one left off.
     *
     * Example:
     * File = "abc\ndef"
     * First readLine() returns "abc"
     * Second readLine() returns "def"
     */
    public String readLine() {
        // TODO: Implement your solution here.
        return "";
    }
}
