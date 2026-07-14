package topic06_sliding_window.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_09_MaxConsecutiveOnesTest {
    private final Easy_09_MaxConsecutiveOnes solver = new Easy_09_MaxConsecutiveOnes();

    @Test
    public void testFindMaxConsecutiveOnes() {
        support.PracticeAssertions.verify(solver);
    }
}
