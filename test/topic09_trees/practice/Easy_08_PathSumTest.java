package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_08_PathSumTest {
    private final Easy_08_PathSum solver = new Easy_08_PathSum();

    @Test
    public void testHasPathSum() {
        support.PracticeAssertions.verify(solver);
    }
}
