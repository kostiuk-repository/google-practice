package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_02_CourseScheduleIITest {
    private final Medium_02_CourseScheduleII solver = new Medium_02_CourseScheduleII();

    @Test
    public void testFindOrder() {
        support.PracticeAssertions.verify(solver);
    }
}
