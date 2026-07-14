package topic18_concurrency_coordination.practice;

public class Medium_01_PrintFooBarAlternately {

    /**
     * Problem: PrintFooBarAlternately
     *
     * Design a class that coordinates two threads printing 'foo' and 'bar' alternately, producing the pattern: 'foobarfoobar...'.
     */
    public void foo(Runnable printFoo) throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void bar(Runnable printBar) throws InterruptedException {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
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
     * Mentor Question: Why is using two semaphores (mutual handoff) often more performant than lock/condition signaling for strict 2-thread turn alternation?
     * 
     * Your Answer: 
     * 
     */
}
