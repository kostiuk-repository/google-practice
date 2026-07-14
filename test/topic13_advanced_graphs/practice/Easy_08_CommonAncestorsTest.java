package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_08_CommonAncestorsTest {
    private final Easy_08_CommonAncestors solver = new Easy_08_CommonAncestors();

    @Test
    public void testHasCommonAncestor() {
        support.PracticeAssertions.verify(solver);
    }
}
