package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_02_LockFreeStackTest {
    @Test
    public void testLockFreePushPop() {
        Hard_02_LockFreeStack stack = new Hard_02_LockFreeStack();
        stack.push(10);
        stack.push(20);
        
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertNull(stack.pop());
    }
}
