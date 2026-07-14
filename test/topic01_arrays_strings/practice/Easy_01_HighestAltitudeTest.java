package topic01_arrays_strings.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_HighestAltitudeTest {
    private final Easy_01_HighestAltitude solver = new Easy_01_HighestAltitude();

    @Test
    public void testExample1() {
        int[] gain = {-5, 1, 5, 0, -7};
        assertEquals(1, solver.largestAltitude(gain));
    }

    @Test
    public void testExample2() {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        assertEquals(0, solver.largestAltitude(gain));
    }

    @Test
    public void testOnlyZero() {
        int[] gain = {0};
        assertEquals(0, solver.largestAltitude(gain));
    }
}
