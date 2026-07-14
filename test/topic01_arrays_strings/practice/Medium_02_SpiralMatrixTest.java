package topic01_arrays_strings.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_02_SpiralMatrixTest {
    private final Medium_02_SpiralMatrix solver = new Medium_02_SpiralMatrix();

    @Test
    public void testSpiralOrder() {
        support.PracticeAssertions.verify(solver);
    }
}
