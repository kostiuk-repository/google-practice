package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.Future;

public class Medium_01_ThreadPoolWebRegistryTest {
    @Test
    public void testThreadPoolRequest() throws Exception {
        Medium_01_ThreadPoolWebRegistry registry = new Medium_01_ThreadPoolWebRegistry();
        Future<String> future = registry.handleRequest("ping");
        assertNotNull(future);
        assertEquals("ping_processed", future.get());
        registry.shutdownPool();
    }
}
