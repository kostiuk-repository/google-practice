package topic19_concurrent_collections_executors;

import java.util.concurrent.*;

/**
 * Example: Parallel task execution using ExecutorService.
 */
public class Example {
    public int calculateSumOfSquares(int[] data) throws InterruptedException, ExecutionException {
        int threads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        
        // Split array into two parts and calculate in parallel
        Future<Integer> part1 = executor.submit(() -> sumSquares(data, 0, data.length / 2));
        Future<Integer> part2 = executor.submit(() -> sumSquares(data, data.length / 2, data.length));
        
        int result = part1.get() + part2.get(); // Blocking wait for completion
        executor.shutdown();
        return result;
    }

    private int sumSquares(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }
}
