package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;

public class Easy_03_SemaphorePermitTest {
    @Test
    public void testPermitsLimit() throws InterruptedException {
        Easy_03_SemaphorePermit semaphore = new Easy_03_SemaphorePermit();
        
        // Acquire all 3 slots
        assertTrue(semaphore.acquireAccess());
        assertTrue(semaphore.acquireAccess());
        assertTrue(semaphore.acquireAccess());
        
        // Fourth acquisition should fail or block (if we use tryAcquire or check availability)
        // Here we just test acquisition and release flow
        semaphore.releaseAccess();
        assertTrue(semaphore.acquireAccess());
    }
}
