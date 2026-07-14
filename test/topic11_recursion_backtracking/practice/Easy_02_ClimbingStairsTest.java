package topic11_recursion_backtracking.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_02_ClimbingStairsTest {
    private final Easy_02_ClimbingStairs solver = new Easy_02_ClimbingStairs();

    @Test
    public void testClimbStairs() {
        support.PracticeAssertions.verify(solver);
    }
}
