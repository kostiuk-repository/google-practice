package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Easy_02_SafeListWriteTest {
    private final Easy_02_SafeListWrite safeList = new Easy_02_SafeListWrite();

    @Test
    public void testSafeIteration() {
        List<String> list = new CopyOnWriteArrayList<>(List.of("one", "two"));
        // This should run without throwing ConcurrentModificationException
        assertDoesNotThrow(() -> safeList.iterateAndAdd(list, "three"));
        assertTrue(list.contains("three"));
    }
}
