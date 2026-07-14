package topic20_modern_java_concurrency.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_01_AsyncFetchDataTest {
    @Test
    public void testCombinedData() throws Exception {
        Medium_01_AsyncFetchData async = new Medium_01_AsyncFetchData();
        String result = async.fetchCombinedData("hello", "world").get();
        assertTrue(result.contains("hello") && result.contains("world"));
    }
}
