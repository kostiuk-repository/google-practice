package topic03_stacks_queues.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_01_EvaluateRPNTest {
    private final Medium_01_EvaluateRPN solver = new Medium_01_EvaluateRPN();

    @Test
    public void testEvalRPN() {
        support.PracticeAssertions.verify(solver);
    }
}
