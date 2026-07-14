package topic14_dynamic_programming.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_05_CoinChangeTest {
    private final Medium_05_CoinChange solver = new Medium_05_CoinChange();

    @Test
    public void testCoinChange() {
        support.PracticeAssertions.verify(solver);
    }
}
