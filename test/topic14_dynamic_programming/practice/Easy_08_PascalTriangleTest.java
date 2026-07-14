package topic14_dynamic_programming.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_08_PascalTriangleTest {
    private final Easy_08_PascalTriangle solver = new Easy_08_PascalTriangle();

    @Test
    public void testGenerate() {
        support.PracticeAssertions.verify(solver);
    }
}
