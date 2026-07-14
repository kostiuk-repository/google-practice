package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_07_BipartiteCheckTest {
    private final Easy_07_BipartiteCheck solver = new Easy_07_BipartiteCheck();

    @Test
    public void testIsBipartite() {
        support.PracticeAssertions.verify(solver);
    }
}
