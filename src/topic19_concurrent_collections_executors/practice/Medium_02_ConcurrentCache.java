package topic19_concurrent_collections_executors.practice;

public class Medium_02_ConcurrentCache {

    /**
     * Problem: ConcurrentCache
     *
     * Implement a thread-safe cache using concurrent collections. Prevent duplicate computation of the same key when accessed concurrently.
     */
    public String getOrCreate(String key, java.util.function.Supplier<String> valueProvider) {
        // TODO: Implement your solution here.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void clearCache() {
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
     * Mentor Question: How does ConcurrentHashMap achieve high write performance without locking the entire map segment in modern Java editions?
     * 
     * Your Answer: 
     * 
     */
}
