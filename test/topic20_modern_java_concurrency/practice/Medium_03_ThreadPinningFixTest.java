package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_03_ThreadPinningFixTest {
    @Test
    public void testThreadPinningLock() {
        Medium_03_ThreadPinningFix safety = new Medium_03_ThreadPinningFix();
        assertDoesNotThrow(safety::performTaskWithLock);
    }
}
