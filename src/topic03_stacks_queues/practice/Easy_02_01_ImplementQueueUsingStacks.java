package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_02_01_ImplementQueueUsingStacks {

    /**
     * Drill 1/5 for Easy_02_ImplementQueueUsingStacks — Transfer All Elements
     * Technique: isolate the core reversal sub-step of the two-stack queue design — popping
     * every element off the input stack and pushing it onto the output stack reverses their
     * order, which is exactly what turns LIFO access into FIFO access.
     *
     * Given two stacks, input and output (output assumed empty), pop every element from
     * input and push it onto output, so output ends up holding the elements in reverse
     * order relative to input. Do not use any other data structure.
     *
     * Example:
     * Input: input = [1,2,3] (top=3), output = []
     * Output: output = [3,2,1] (top=1), input = []
     */
    public void transferAll(Deque<Integer> input, Deque<Integer> output) {
        // TODO: Implement your solution here.
    }
}
