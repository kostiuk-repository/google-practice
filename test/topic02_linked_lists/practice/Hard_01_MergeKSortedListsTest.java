package topic02_linked_lists.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_01_MergeKSortedListsTest {
    private final Hard_01_MergeKSortedLists solver = new Hard_01_MergeKSortedLists();

    @Test
    public void testMergeKLists() {
        support.PracticeAssertions.verify(solver);
    }
}
