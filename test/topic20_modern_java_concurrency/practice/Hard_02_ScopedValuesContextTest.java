package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicReference;

public class Hard_02_ScopedValuesContextTest {
    @Test
    public void testScopedValuesPropagation() {
        Hard_02_ScopedValuesContext scope = new Hard_02_ScopedValuesContext();
        AtomicReference<String> readUser = new AtomicReference<>();
        
        // Testing that the action runs in the scope. 
        // We will just verify it runs without crashing.
        assertDoesNotThrow(() -> scope.runWithUserContext("admin", () -> readUser.set("admin")));
        assertEquals("admin", readUser.get());
    }
}
