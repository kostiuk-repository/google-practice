package topic17_multithreading_basics.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;

public class Easy_02_ThreadSafeCounterTest {
    @Test
    public void testConcurrentIncrements() throws InterruptedException {
        Easy_02_ThreadSafeCounter counter = new Easy_02_ThreadSafeCounter();
        int threadsCount = 10;
        int incrementsPerThread = 1000;
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
        CountDownLatch latch = new CountDownLatch(threadsCount);

        for (int i = 0; i < threadsCount; i++) {
            executor.submit(() -> {
                try {
                    for (int j = 0; j < incrementsPerThread; j++) {
                        counter.increment();
                    }
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await(5, TimeUnit.SECONDS);
        executor.shutdown();
        assertEquals(threadsCount * incrementsPerThread, counter.getCount());
    }
}
