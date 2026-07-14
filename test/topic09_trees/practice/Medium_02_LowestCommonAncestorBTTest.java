package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_02_LowestCommonAncestorBTTest {
    private final Medium_02_LowestCommonAncestorBT solver = new Medium_02_LowestCommonAncestorBT();

    @Test
    public void testLowestCommonAncestor() {
        support.PracticeAssertions.verify(solver);
    }
}
