package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;

public class Easy_01_SimpleSignalTest {
    @Test
    public void testBasicSignal() throws InterruptedException {
        Easy_01_SimpleSignal signal = new Easy_01_SimpleSignal();
        CountDownLatch started = new CountDownLatch(1);
        CountDownLatch finished = new CountDownLatch(1);
        
        Thread t1 = new Thread(() -> {
            try {
                started.countDown();
                signal.waitForSignal();
                finished.countDown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        t1.start();
        started.await();
        Thread.sleep(200); // Give waiting thread time to block
        
        assertEquals(1, finished.getCount()); // Still blocked
        signal.sendSignal();
        
        assertTrue(finished.await(2, TimeUnit.SECONDS)); // Unblocked
    }
}
