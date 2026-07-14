package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_InorderTraversalTest {
    private final Easy_01_InorderTraversal solver = new Easy_01_InorderTraversal();

    @Test
    public void testInorderTraversal() {
        support.PracticeAssertions.verify(solver);
    }
}
