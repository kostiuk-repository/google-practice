package topic12_heaps_sorting.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_02_FindMedianFromDataStreamTest {
    private final Hard_02_FindMedianFromDataStream solver = new Hard_02_FindMedianFromDataStream();

    @Test
    public void testFindMedian() {
        support.PracticeAssertions.verify(solver);
    }
}
