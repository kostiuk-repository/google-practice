package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_03_SymmetricTreeTest {
    private final Easy_03_SymmetricTree solver = new Easy_03_SymmetricTree();

    @Test
    public void testIsSymmetric() {
        support.PracticeAssertions.verify(solver);
    }
}
