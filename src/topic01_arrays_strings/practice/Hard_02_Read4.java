package topic01_arrays_strings.practice;

/**
 * Problem: Read N Characters Given Read4 II - Call multiple times
 * 
 * Given a file and assume that you can only read the file using a given method read4, 
 * implement a method to read n characters.
 * 
 * Method read4:
 * The API read4 reads 4 consecutive characters from a file, then writes those characters 
 * into the buffer array buf4.
 * The return value is the number of actual characters read.
 * Note that read4() has its own file pointer, much like FILE *fp in C.
 * 
 * Definition of read4:
 *     int read4(char[] buf4);
 * 
 * Method read:
 * By using the read4 method, implement the method read that reads n characters from the 
 * file and store them in the buffer array buf. You may not call read4 directly.
 * 
 * Note that the read method may be called multiple times.
 * 
 * Example:
 * File = "abc", read(1), read(2)
 * First read(1) returns "a", buf = ["a"]
 * Second read(2) returns "bc", buf = ["b", "c"]
 */
class Reader4 {
    private final String content;
    private int position;

    Reader4() {
        this("");
    }

    Reader4(String content) {
        this.content = content;
    }

    int read4(char[] buf4) {
        int count = 0;
        while (count < 4 && position < content.length()) {
            buf4[count++] = content.charAt(position++);
        }
        return count;
    }
}

public class Hard_02_Read4 extends Reader4 {

    // You need to maintain internal state because read() can be called multiple times,
    // and read4() might return characters that we don't need in the current call, 
    // but must store for subsequent calls.
    private char[] internalBuffer = new char[4];
    private int internalPtr = 0;
    private int internalCount = 0;

    public Hard_02_Read4() {
        super();
    }

    /** Test-friendly replacement for the platform-provided file source. */
    public Hard_02_Read4(String content) {
        super(content);
    }

    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        // TODO: Implement your solution here.
        return 0;
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
     * Mentor Question: Why do we need member variables (`internalBuffer`, `internalPtr`, `internalCount`) 
     * for this problem, whereas "Read N Characters Given Read4 I (Call single time)" does not require them?
     * What happens to the "leftover" characters read by read4() that exceed the current requested `n`?
     * 
     * Your Answer: 
     * 
     */
}
