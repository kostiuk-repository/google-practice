package topic17_multithreading_basics.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;

public class Easy_01_PrintInOrderTest {
    @Test
    public void testExecutionOrder() throws InterruptedException {
        Easy_01_PrintInOrder printInOrder = new Easy_01_PrintInOrder();
        List<String> list = new CopyOnWriteArrayList<>();
        
        Thread t1 = new Thread(() -> {
            try {
                printInOrder.first(() -> list.add("first"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t2 = new Thread(() -> {
            try {
                printInOrder.second(() -> list.add("second"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t3 = new Thread(() -> {
            try {
                printInOrder.third(() -> list.add("third"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        // Start out of order
        t3.start();
        t2.start();
        t1.start();
        
        t1.join(2000);
        t2.join(2000);
        t3.join(2000);
        
        assertEquals(List.of("first", "second", "third"), list);
    }
}
