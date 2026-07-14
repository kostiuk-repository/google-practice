package topic10_dfs_bfs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_02_RottingOrangesTest {
    private final Medium_02_RottingOranges solver = new Medium_02_RottingOranges();

    @Test
    public void testOrangesRotting() {
        support.PracticeAssertions.verify(solver);
    }
}
