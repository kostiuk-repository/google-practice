package topic02_linked_lists.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hard_03_CopyListWithRandomPointerTest {
    private final Hard_03_CopyListWithRandomPointer solver = new Hard_03_CopyListWithRandomPointer();

    @Test
    public void testCopyRandomList() {
        support.PracticeAssertions.verify(solver);
    }
}
