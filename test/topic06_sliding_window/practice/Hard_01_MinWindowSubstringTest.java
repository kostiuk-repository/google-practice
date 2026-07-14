package topic06_sliding_window.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_MinWindowSubstringTest {
    private final Hard_01_MinWindowSubstring solver = new Hard_01_MinWindowSubstring();

    @Test
    public void testMinWindow() {
        support.PracticeAssertions.verify(solver);
    }
}
