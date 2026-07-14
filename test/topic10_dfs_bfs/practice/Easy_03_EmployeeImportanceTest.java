package topic10_dfs_bfs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_03_EmployeeImportanceTest {
    private final Easy_03_EmployeeImportance solver = new Easy_03_EmployeeImportance();

    @Test
    public void testGetImportance() {
        support.PracticeAssertions.verify(solver);
    }
}
