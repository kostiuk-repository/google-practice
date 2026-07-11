package topic03_stacks_queues;

import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Example Problem: Valid Parentheses
 * 
 * Problem Statement:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Input: s = "(]"
 * Output: false
 */
public class Example {

    public boolean isValid(String s) {
        // =========================================================================
        // STEP 1: CLARIFICATION & CONSTRAINTS (Gathering requirements)
        // =========================================================================
        // - "Can the string be empty?" -> Yes, let's assume empty string is valid.
        // - "Does it contain any other characters besides parentheses?" -> No, only '(', ')', '[', ']', '{', '}'.
        // - "What is the maximum length of s?" -> Length is up to 10^4.
        
        // =========================================================================
        // STEP 2: GUARD CLAUSES / EDGE CASES (Handling invalid/extreme inputs)
        // =========================================================================
        if (s == null || s.length() == 0) {
            return true;
        }
        // An odd-length string cannot be valid since every opening bracket needs a closing pair
        if (s.length() % 2 != 0) {
            return false;
        }

        // =========================================================================
        // STEP 3: HIGH-LEVEL ALGORITHM & COMPLEXITY DESIGN
        // =========================================================================
        // Stack-based Approach:
        // As we traverse the string:
        // - If we see an opening bracket ('(', '{', '['), we push it onto the stack.
        //   (Alternatively, we can push the corresponding closing bracket to make matching cleaner).
        // - If we see a closing bracket (')', '}', ']'):
        //   - If the stack is empty, it means we have a closing bracket without an opening bracket. Return false.
        //   - Pop the top of the stack and check if it matches the current closing bracket. If not, return false.
        // - At the end of the string, if the stack is empty, all brackets were matched. Return true. Otherwise, return false.
        //
        // Time Complexity: O(N) since we push and pop each character at most once.
        // Space Complexity: O(N) in the worst case (e.g., "[[[[").

        // =========================================================================
        // STEP 4: CLEAN IMPLEMENTATION
        // =========================================================================
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If it is a closing bracket, check stack emptiness and match
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // =========================================================================
    // STEP 5: DRY RUN / TESTING (Walkthrough with sample inputs)
    // =========================================================================
    /*
     * Test Case 1: s = "()[]{}"
     * - i = 0, c = '(': stack.push(')') -> stack: [')']
     * - i = 1, c = ')': stack is not empty, stack.pop() = ')' == ')' -> stack: []
     * - i = 2, c = '[': stack.push(']') -> stack: [']']
     * - i = 3, c = ']': stack is not empty, stack.pop() = ']' == ']' -> stack: []
     * - i = 4, c = '{': stack.push('}') -> stack: ['}']
     * - i = 5, c = '}': stack is not empty, stack.pop() = '}' == '}' -> stack: []
     * - Loop ends. stack.isEmpty() -> true.
     * - Returns: true
     * - Status: Success!
     * 
     * Test Case 2: s = "([)]"
     * - i = 0, c = '(': stack.push(')') -> stack: [')']
     * - i = 1, c = '[': stack.push(']') -> stack: [']', ')']
     * - i = 2, c = ')': stack is not empty, stack.pop() = ']' != ')' -> returns false!
     * - Returns: false
     * - Status: Success!
     */
}
