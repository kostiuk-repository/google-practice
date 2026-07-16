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

    @Test
    public void testDrill01_RunningSum() {
        Easy_01_01_HighestAltitude drill = new Easy_01_01_HighestAltitude();
        assertArrayEquals(new int[]{1, 3, 6, 10}, drill.runningSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testDrill02_HighestPiggyBankBalance() {
        Easy_01_02_HighestAltitude drill = new Easy_01_02_HighestAltitude();
        assertEquals(25, drill.highestBalance(new int[]{10, -5, 20, -15, 5}));
    }

    @Test
    public void testDrill03_BelowZero() {
        Easy_01_03_HighestAltitude drill = new Easy_01_03_HighestAltitude();
        assertFalse(drill.belowZero(new int[]{10, -2, -8, 5}));
        assertTrue(drill.belowZero(new int[]{10, -15, 5}));
    }

    @Test
    public void testDrill04_AltitudeRange() {
        Easy_01_04_HighestAltitude drill = new Easy_01_04_HighestAltitude();
        assertEquals(7, drill.altitudeRange(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    public void testDrill05_MaxProfit() {
        Easy_01_05_HighestAltitude drill = new Easy_01_05_HighestAltitude();
        assertEquals(5, drill.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
