package topic02_linked_lists.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_02_MergeTwoSortedListsTest {
    private final Easy_02_MergeTwoSortedLists solver = new Easy_02_MergeTwoSortedLists();

    @Test
    public void testMergeTwoLists() {
        support.PracticeAssertions.verify(solver);
    }
}
