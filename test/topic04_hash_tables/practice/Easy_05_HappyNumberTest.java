package topic04_hash_tables.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_05_HappyNumberTest {
    private final Easy_05_HappyNumber solver = new Easy_05_HappyNumber();

    @Test
    public void testIsHappy() {
        support.PracticeAssertions.verify(solver);
    }
}
