package topic01_arrays_strings.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_07_MonotonicArrayTest {
    private final Easy_07_MonotonicArray solver = new Easy_07_MonotonicArray();

    @Test
    public void testIsMonotonic() {
        support.PracticeAssertions.verify(solver);
    }
}
