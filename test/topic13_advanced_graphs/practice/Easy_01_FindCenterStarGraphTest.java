package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_FindCenterStarGraphTest {
    private final Easy_01_FindCenterStarGraph solver = new Easy_01_FindCenterStarGraph();

    @Test
    public void testFindCenter() {
        support.PracticeAssertions.verify(solver);
    }
}
