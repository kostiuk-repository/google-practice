package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_03_AtomicIncrementTest {
    private final Easy_03_AtomicIncrement atomic = new Easy_03_AtomicIncrement();

    @Test
    public void testIncrement() {
        assertEquals(1, atomic.incrementAndGet());
        assertTrue(atomic.compareAndSet(1, 10));
        assertFalse(atomic.compareAndSet(1, 20));
    }
}
