package topic20_modern_java_concurrency.practice;

public class Medium_01_AsyncFetchData {

    /**
     * Problem: AsyncFetchData
     *
     * Write an asynchronous method that queries two remote sources in parallel and combines their results non-blockingly.
     */
    public java.util.concurrent.CompletableFuture<String> fetchCombinedData(String source1, String source2) {
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
     * Mentor Question: Why does CompletableFuture run in ForkJoinPool.commonPool() by default, and why is this problematic for long-running I/O tasks?
     * 
     * Your Answer: 
     * 
     */
}
