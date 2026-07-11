package topic01_arrays_strings.practice;

class Reader4Stub01 {
    // Fake implementation of read4 for compilation/IDE reference.
    // In actual system, this is API provided by the platform.
    int read4(char[] buf4) {
        return 0;
    }
}

public class Hard_02_01_Read4 extends Reader4Stub01 {

    /**
     * Drill 1/5 for Hard_02_Read4 — Read Single Call
     * Technique: wrap the chunked low-level reader (read4) to fill a caller-supplied
     * buffer, the same core "call read4 in a loop and copy into buf" idea as the
     * original problem — but for the single-call variant. This version does NOT need
     * internalBuffer/internalPtr/internalCount, because read() is guaranteed to be
     * called only once: any characters read4 over-reads beyond what's needed for this
     * call can simply be dropped, since there will never be a "next call" to hand them
     * to. The original multi-call version needs that leftover-buffer state precisely
     * because read4 reads in fixed chunks of 4 and may over-read relative to n, and
     * those extra characters must survive until a future read() call consumes them.
     *
     * By using the read4 method, implement read(char[] buf, int n) that reads n
     * characters from the file and stores them in the buffer array buf, returning the
     * number of characters actually read (which may be less than n if the file is
     * shorter). You may not call read4 directly from outside this class... except this
     * class extends Reader4Stub01, so read4 is available as an inherited method.
     *
     * Example:
     * File = "abcde", read(buf, 3)
     * Output: 3, buf = ['a','b','c']
     */
    public int read(char[] buf, int n) {
        // TODO: Implement your solution here.
        return 0;
    }
}
