package topic08_binary_search.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_MedianTwoSortedArraysTest {
    private final Hard_01_MedianTwoSortedArrays solver = new Hard_01_MedianTwoSortedArrays();

    @Test
    public void testFindMedianSortedArrays() {
        support.PracticeAssertions.verify(solver);
    }
}
