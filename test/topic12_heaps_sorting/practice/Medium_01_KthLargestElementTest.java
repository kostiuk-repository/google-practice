package topic12_heaps_sorting.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_01_KthLargestElementTest {
    private final Medium_01_KthLargestElement solver = new Medium_01_KthLargestElement();

    @Test
    public void testFindKthLargest() {
        support.PracticeAssertions.verify(solver);
    }
}
