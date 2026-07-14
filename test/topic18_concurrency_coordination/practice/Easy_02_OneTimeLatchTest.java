package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;

public class Easy_02_OneTimeLatchTest {
    @Test
    public void testLatchBlockAndRelease() throws InterruptedException {
        Easy_02_OneTimeLatch latch = new Easy_02_OneTimeLatch();
        CountDownLatch finished = new CountDownLatch(2);
        
        Runnable task = () -> {
            try {
                latch.awaitInitialization();
                finished.countDown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        
        new Thread(task).start();
        new Thread(task).start();
        
        Thread.sleep(200);
        assertEquals(2, finished.getCount()); // Both blocked
        
        latch.initialize();
        assertTrue(finished.await(2, TimeUnit.SECONDS)); // Both released
    }
}
