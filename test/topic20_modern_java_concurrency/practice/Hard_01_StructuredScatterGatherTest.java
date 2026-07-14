package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.concurrent.Callable;

public class Hard_01_StructuredScatterGatherTest {
    @Test
    public void testStructuredGather() throws Exception {
        Hard_01_StructuredScatterGather scope = new Hard_01_StructuredScatterGather();
        
        Callable<String> t1 = () -> "flight1";
        Callable<String> t2 = () -> { Thread.sleep(200); return "flight2"; };
        
        // In ShutdownOnSuccess, it should return the fastest one
        String result = scope.getFirstSuccessfulResult(List.of(t1, t2));
        assertNotNull(result);
    }
}
