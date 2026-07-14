package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_03_MinVerticesReachAllTest {
    private final Easy_03_MinVerticesReachAll solver = new Easy_03_MinVerticesReachAll();

    @Test
    public void testFindSmallestSetOfVertices() {
        support.PracticeAssertions.verify(solver);
    }
}
