package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_03_ReadWriteSafeRegistryTest {
    @Test
    public void testReadWrite() {
        Medium_03_ReadWriteSafeRegistry registry = new Medium_03_ReadWriteSafeRegistry();
        registry.writeData("key", "value");
        assertEquals("value", registry.readData("key"));
    }
}
