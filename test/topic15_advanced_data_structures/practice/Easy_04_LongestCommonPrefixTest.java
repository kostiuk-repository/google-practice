package topic15_advanced_data_structures.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_04_LongestCommonPrefixTest {
    private final Easy_04_LongestCommonPrefix solver = new Easy_04_LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() {
        support.PracticeAssertions.verify(solver);
    }
}
