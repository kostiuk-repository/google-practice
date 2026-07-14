package topic10_dfs_bfs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_05_FindIfPathExistsTest {
    private final Easy_05_FindIfPathExists solver = new Easy_05_FindIfPathExists();

    @Test
    public void testValidPath() {
        support.PracticeAssertions.verify(solver);
    }
}
