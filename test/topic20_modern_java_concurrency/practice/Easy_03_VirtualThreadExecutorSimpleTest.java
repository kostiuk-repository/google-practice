package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Easy_03_VirtualThreadExecutorSimpleTest {
    private final Easy_03_VirtualThreadExecutorSimple loomExecutor = new Easy_03_VirtualThreadExecutorSimple();

    @Test
    public void testVirtualExecutor() throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();
        List<Runnable> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(counter::incrementAndGet);
        }
        
        loomExecutor.runTasksInVirtualExecutor(tasks);
        assertEquals(10, counter.get());
    }
}
