package topic15_advanced_data_structures.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_02_MonotonicArrayTest {
    private final Easy_02_MonotonicArray solver = new Easy_02_MonotonicArray();

    @Test
    public void testIsMonotonic() {
        support.PracticeAssertions.verify(solver);
    }
}
