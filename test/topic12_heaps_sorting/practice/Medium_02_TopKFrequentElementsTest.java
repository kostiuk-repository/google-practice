package topic12_heaps_sorting.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_02_TopKFrequentElementsTest {
    private final Medium_02_TopKFrequentElements solver = new Medium_02_TopKFrequentElements();

    @Test
    public void testTopKFrequent() {
        support.PracticeAssertions.verify(solver);
    }
}
