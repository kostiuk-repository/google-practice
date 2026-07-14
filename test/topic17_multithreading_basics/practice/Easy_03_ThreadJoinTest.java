package topic17_multithreading_basics.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Easy_03_ThreadJoinTest {
    @Test
    public void testSequentialRun() throws InterruptedException {
        Easy_03_ThreadJoin joiner = new Easy_03_ThreadJoin();
        List<String> list = new CopyOnWriteArrayList<>();
        
        Runnable task1 = () -> {
            try {
                Thread.sleep(100);
                list.add("task1");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        
        Runnable task2 = () -> list.add("task2");
        
        joiner.runSequentially(task1, task2);
        assertEquals(List.of("task1", "task2"), list);
    }
}
