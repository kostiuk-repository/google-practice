package topic12_heaps_sorting.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_SmallestRangeTest {
    private final Hard_01_SmallestRange solver = new Hard_01_SmallestRange();

    @Test
    public void testFindSmallestRange() {
        support.PracticeAssertions.verify(solver);
    }
}
