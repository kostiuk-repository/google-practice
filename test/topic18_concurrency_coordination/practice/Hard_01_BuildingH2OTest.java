package topic18_concurrency_coordination.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Hard_01_BuildingH2OTest {
    @Test
    public void testH2OAssembly() throws InterruptedException {
        Hard_01_BuildingH2O h2o = new Hard_01_BuildingH2O();
        List<String> list = new CopyOnWriteArrayList<>();
        
        Thread t1 = new Thread(() -> {
            try {
                h2o.hydrogen(() -> list.add("H"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t2 = new Thread(() -> {
            try {
                h2o.hydrogen(() -> list.add("H"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        Thread t3 = new Thread(() -> {
            try {
                h2o.oxygen(() -> list.add("O"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        t1.start(); t2.start(); t3.start();
        t1.join(2000); t2.join(2000); t3.join(2000);
        
        // Assert exactly 2 H and 1 O are outputs
        long hCount = list.stream().filter(s -> s.equals("H")).count();
        long oCount = list.stream().filter(s -> s.equals("O")).count();
        
        assertEquals(2, hCount);
        assertEquals(1, oCount);
    }
}
