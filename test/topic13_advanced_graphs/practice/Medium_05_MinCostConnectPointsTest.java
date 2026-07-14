package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_05_MinCostConnectPointsTest {
    private final Medium_05_MinCostConnectPoints solver = new Medium_05_MinCostConnectPoints();

    @Test
    public void testMinCostConnectPoints() {
        support.PracticeAssertions.verify(solver);
    }
}
