package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_01_LevelOrderTraversalTest {
    private final Medium_01_LevelOrderTraversal solver = new Medium_01_LevelOrderTraversal();

    @Test
    public void testLevelOrder() {
        support.PracticeAssertions.verify(solver);
    }
}
