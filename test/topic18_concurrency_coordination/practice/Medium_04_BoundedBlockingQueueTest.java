package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;

public class Medium_04_BoundedBlockingQueueTest {
    @Test
    public void testEnqueueDequeue() throws InterruptedException {
        Medium_04_BoundedBlockingQueue queue = new Medium_04_BoundedBlockingQueue();
        
        queue.enqueue(1);
        queue.enqueue(2);
        
        assertEquals(2, queue.size());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(0, queue.size());
    }
}
