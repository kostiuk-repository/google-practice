package topic07_prefix_sums.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_RunningSumTest {
    private final Easy_01_RunningSum solver = new Easy_01_RunningSum();

    @Test
    public void testRunningSum() {
        support.PracticeAssertions.verify(solver);
    }
}
