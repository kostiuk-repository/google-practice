package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Hard_01_CustomThreadPoolTest {
    @Test
    public void testCustomPoolExecution() throws InterruptedException {
        Hard_01_CustomThreadPool pool = new Hard_01_CustomThreadPool();
        AtomicInteger counter = new AtomicInteger();
        CountDownLatch latch = new CountDownLatch(5);
        
        for (int i = 0; i < 5; i++) {
            pool.execute(() -> {
                counter.incrementAndGet();
                latch.countDown();
            });
        }
        
        assertTrue(latch.await(3, TimeUnit.SECONDS));
        pool.shutdown();
        assertEquals(5, counter.get());
    }
}
