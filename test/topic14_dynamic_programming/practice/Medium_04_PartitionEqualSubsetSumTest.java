package topic14_dynamic_programming.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_04_PartitionEqualSubsetSumTest {
    private final Medium_04_PartitionEqualSubsetSum solver = new Medium_04_PartitionEqualSubsetSum();

    @Test
    public void testCanPartition() {
        support.PracticeAssertions.verify(solver);
    }
}
