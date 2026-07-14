package topic11_recursion_backtracking.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_NQueensTest {
    private final Hard_01_NQueens solver = new Hard_01_NQueens();

    @Test
    public void testSolveNQueens() {
        support.PracticeAssertions.verify(solver);
    }
}
