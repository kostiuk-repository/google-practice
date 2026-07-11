package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Medium_03_SimplifyPath {

    /**
     * Problem: Simplify Path
     * 
     * Given an absolute path for a Unix-style file system, which begins with a slash '/', 
     * transform this path into its simplified canonical path.
     * 
     * Unix-style path rules:
     * - A single period '.' refers to the current directory.
     * - A double period '..' moves the directory up a level.
     * - Multiple consecutive slashes (e.g. "//") are treated as a single slash '/'.
     * 
     * The simplified canonical path must:
     * 1. Start with a single slash '/'.
     * 2. Not end with a trailing slash '/'.
     * 3. Only contain directories between slashes (no '.' or '..').
     * 
     * Example:
     * Input: path = "/home//foo/"
     * Output: "/home/foo"
     * 
     * Example 2:
     * Input: path = "/../"
     * Output: "/"
     */
    public String simplifyPath(String path) {
        // TODO: Implement your solution here.
        return "";
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
     * Mentor Question: Unix paths can be split by '/'. What are the four types of tokens 
     * you can get after splitting, and how does your Stack process each one?
     * 
     * Your Answer: 
     * 
     */
}
