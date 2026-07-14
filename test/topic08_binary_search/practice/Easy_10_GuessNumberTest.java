package topic08_binary_search.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_10_GuessNumberTest {
    private final Easy_10_GuessNumber solver = new Easy_10_GuessNumber();

    @Test
    public void testGuessNumber() {
        support.PracticeAssertions.verify(solver);
    }
}
