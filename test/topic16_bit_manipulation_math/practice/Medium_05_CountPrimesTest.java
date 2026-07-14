package topic16_bit_manipulation_math.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_05_CountPrimesTest {
    private final Medium_05_CountPrimes solver = new Medium_05_CountPrimes();

    @Test
    public void testCountPrimes() {
        support.PracticeAssertions.verify(solver);
    }
}
