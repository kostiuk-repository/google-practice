package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Medium_02_VirtualThreadsIOTest {
    @Test
    public void testTasksExecution() {
        Medium_02_VirtualThreadsIO loom = new Medium_02_VirtualThreadsIO();
        AtomicInteger counter = new AtomicInteger();
        
        assertDoesNotThrow(() -> loom.executeTasks(50, counter::incrementAndGet));
        assertEquals(50, counter.get());
    }
}
