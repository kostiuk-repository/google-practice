package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Easy_02_SpawnVirtualThreadTest {
    private final Easy_02_SpawnVirtualThread loom = new Easy_02_SpawnVirtualThread();

    @Test
    public void testVirtualThreadSpawn() throws InterruptedException {
        AtomicBoolean run = new AtomicBoolean();
        loom.startVirtual(() -> run.set(true));
        
        Thread.sleep(200); // Wait for thread run loop
        assertTrue(run.get());
    }
}
