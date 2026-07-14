package topic17_multithreading_basics.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;
import java.util.Set;

public class Easy_04_LazyInitializerTest {
    @Test
    public void testSingletonInstance() throws InterruptedException {
        Easy_04_LazyInitializer initializer = new Easy_04_LazyInitializer();
        Set<Object> instances = ConcurrentHashMap.newKeySet();
        int threadsCount = 50;
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
        CountDownLatch latch = new CountDownLatch(threadsCount);

        for (int i = 0; i < threadsCount; i++) {
            executor.submit(() -> {
                instances.add(initializer.getInstance());
                latch.countDown();
            });
        }

        latch.await(5, TimeUnit.SECONDS);
        executor.shutdown();
        
        assertEquals(1, instances.size());
        assertNotNull(instances.iterator().next());
    }
}
