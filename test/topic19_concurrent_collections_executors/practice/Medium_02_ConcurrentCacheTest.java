package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Medium_02_ConcurrentCacheTest {
    @Test
    public void testCacheGeneration() {
        Medium_02_ConcurrentCache cache = new Medium_02_ConcurrentCache();
        AtomicInteger counter = new AtomicInteger();
        
        String val1 = cache.getOrCreate("key", () -> {
            counter.incrementAndGet();
            return "value";
        });
        
        String val2 = cache.getOrCreate("key", () -> {
            counter.incrementAndGet();
            return "value";
        });
        
        assertEquals("value", val1);
        assertEquals("value", val2);
        assertEquals(1, counter.get()); // Provider called exactly once
    }
}
