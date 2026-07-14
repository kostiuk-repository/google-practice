package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_SimpleCompletableFutureTest {
    private final Easy_01_SimpleCompletableFuture async = new Easy_01_SimpleCompletableFuture();

    @Test
    public void testCompletableFutureUppercase() throws Exception {
        assertEquals("JAVA", async.calculateAsyncString("java"));
    }
}
