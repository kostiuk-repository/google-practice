package topic09_trees.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_04_ValidateBSTTest {
    private final Medium_04_ValidateBST solver = new Medium_04_ValidateBST();

    @Test
    public void testIsValidBST() {
        support.PracticeAssertions.verify(solver);
    }
}
