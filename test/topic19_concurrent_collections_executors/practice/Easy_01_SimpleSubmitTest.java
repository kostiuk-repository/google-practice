package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_SimpleSubmitTest {
    private final Easy_01_SimpleSubmit submitter = new Easy_01_SimpleSubmit();

    @Test
    public void testCallableTask() throws Exception {
        String result = submitter.submitTask(() -> "Hello");
        assertEquals("Hello", result);
    }
}
