package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_PathMinEffortTest {
    private final Hard_01_PathMinEffort solver = new Hard_01_PathMinEffort();

    @Test
    public void testMinimumEffortPath() {
        support.PracticeAssertions.verify(solver);
    }
}
