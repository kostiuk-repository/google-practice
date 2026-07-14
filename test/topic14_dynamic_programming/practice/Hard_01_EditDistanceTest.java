package topic14_dynamic_programming.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_EditDistanceTest {
    private final Hard_01_EditDistance solver = new Hard_01_EditDistance();

    @Test
    public void testMinDistance() {
        support.PracticeAssertions.verify(solver);
    }
}
