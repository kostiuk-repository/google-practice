package topic10_dfs_bfs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_04_CourseScheduleTest {
    private final Medium_04_CourseSchedule solver = new Medium_04_CourseSchedule();

    @Test
    public void testCanFinish() {
        support.PracticeAssertions.verify(solver);
    }
}
