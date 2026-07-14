package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_07_BalancedTreeTest {
    private final Easy_07_BalancedTree solver = new Easy_07_BalancedTree();

    @Test
    public void testIsBalanced() {
        support.PracticeAssertions.verify(solver);
    }
}
