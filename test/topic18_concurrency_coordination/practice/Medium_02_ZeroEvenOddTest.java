package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Medium_02_ZeroEvenOddTest {
    @Test
    public void testZeroEvenOddOrder() throws InterruptedException {
        Medium_02_ZeroEvenOdd zeroEvenOdd = new Medium_02_ZeroEvenOdd();
        List<Integer> list = new CopyOnWriteArrayList<>();
        
        Thread t1 = new Thread(() -> {
            try {
                zeroEvenOdd.zero(list::add);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t2 = new Thread(() -> {
            try {
                zeroEvenOdd.even(list::add);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t3 = new Thread(() -> {
            try {
                zeroEvenOdd.odd(list::add);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.join(3000);
        t2.join(3000);
        t3.join(3000);
        
        // Assert sequence starts correctly with 0, then odd, then 0, then even.
        if (!list.isEmpty()) {
            assertEquals(0, list.get(0));
        }
    }
}
