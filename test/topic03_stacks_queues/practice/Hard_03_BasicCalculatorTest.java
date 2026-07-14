package topic03_stacks_queues.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_03_BasicCalculatorTest {
    private final Hard_03_BasicCalculator solver = new Hard_03_BasicCalculator();

    @Test
    public void testCalculate() {
        support.PracticeAssertions.verify(solver);
    }
}
