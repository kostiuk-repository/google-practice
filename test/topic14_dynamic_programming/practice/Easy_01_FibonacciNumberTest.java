package topic14_dynamic_programming.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_FibonacciNumberTest {
    private final Easy_01_FibonacciNumber solver = new Easy_01_FibonacciNumber();

    @Test
    public void testFib() {
        support.PracticeAssertions.verify(solver);
    }
}
