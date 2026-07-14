package topic16_bit_manipulation_math.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_02_IntegerToEnglishWordsTest {
    private final Hard_02_IntegerToEnglishWords solver = new Hard_02_IntegerToEnglishWords();

    @Test
    public void testNumberToWords() {
        support.PracticeAssertions.verify(solver);
    }
}
