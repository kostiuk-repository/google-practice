package topic19_concurrent_collections_executors.practice;

public class Medium_01_ThreadPoolWebRegistry {

    /**
     * Problem: ThreadPoolWebRegistry
     *
     * Design a request registry that handles incoming HTTP requests concurrently using ExecutorService. Handle queue size limits and cleanups.
     */
    public java.util.concurrent.Future<String> handleRequest(String request) {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void shutdownPool() {
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
     * Mentor Question: Why does using an unbounded queue in a high-throughput thread pool expose your application to OutOfMemoryErrors?
     * 
     * Your Answer: 
     * 
     */
}
