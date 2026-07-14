package topic11_recursion_backtracking.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_FibonacciTest {
    private final Easy_01_Fibonacci solver = new Easy_01_Fibonacci();

    @Test
    public void testFib() {
        support.PracticeAssertions.verify(solver);
    }
}
