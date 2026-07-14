package topic10_dfs_bfs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_FloodFillTest {
    private final Easy_01_FloodFill solver = new Easy_01_FloodFill();

    @Test
    public void testFloodFill() {
        support.PracticeAssertions.verify(solver);
    }
}
