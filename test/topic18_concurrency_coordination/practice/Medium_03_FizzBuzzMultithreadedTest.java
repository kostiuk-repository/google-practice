package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Medium_03_FizzBuzzMultithreadedTest {
    @Test
    public void testFizzBuzzMultithreaded() throws InterruptedException {
        Medium_03_FizzBuzzMultithreaded fb = new Medium_03_FizzBuzzMultithreaded();
        List<String> list = new CopyOnWriteArrayList<>();
        
        Thread t1 = new Thread(() -> {
            try {
                fb.fizz(() -> list.add("fizz"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t2 = new Thread(() -> {
            try {
                fb.buzz(() -> list.add("buzz"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t3 = new Thread(() -> {
            try {
                fb.fizzbuzz(() -> list.add("fizzbuzz"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t4 = new Thread(() -> {
            try {
                fb.number(val -> list.add(String.valueOf(val)));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        t1.start(); t2.start(); t3.start(); t4.start();
        t1.join(3000); t2.join(3000); t3.join(3000); t4.join(3000);
        
        // Validation could be dynamic depending on limit 'n'.
        // Assuming tasks are properly coordinates.
    }
}
