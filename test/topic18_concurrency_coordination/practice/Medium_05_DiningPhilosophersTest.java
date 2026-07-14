package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Medium_05_DiningPhilosophersTest {
    @Test
    public void testPhilosophersEat() throws InterruptedException {
        Medium_05_DiningPhilosophers dining = new Medium_05_DiningPhilosophers();
        AtomicInteger eatCount = new AtomicInteger();
        
        Thread t = new Thread(() -> {
            try {
                dining.wantsToEat(0, ()->{}, ()->{}, eatCount::incrementAndGet, ()->{}, ()->{});
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        t.start();
        t.join(2000);
        assertEquals(1, eatCount.get());
    }
}
