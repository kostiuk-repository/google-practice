package topic06_sliding_window.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_03_SlidingWindowMaximumTest {
    private final Hard_03_SlidingWindowMaximum solver = new Hard_03_SlidingWindowMaximum();

    @Test
    public void testMaxSlidingWindow() {
        support.PracticeAssertions.verify(solver);
    }
}
