package topic19_concurrent_collections_executors.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_04_ParallelArraySumPoolTest {
    @Test
    public void testForkJoinSum() {
        Medium_04_ParallelArraySumPool solver = new Medium_04_ParallelArraySumPool();
        int[] data = {1, 2, 3, 4, 5};
        assertEquals(15, solver.sum(data));
    }
}
