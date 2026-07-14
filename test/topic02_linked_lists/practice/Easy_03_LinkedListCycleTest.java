package topic02_linked_lists.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_03_LinkedListCycleTest {
    private final Easy_03_LinkedListCycle solver = new Easy_03_LinkedListCycle();

    @Test
    public void testHasCycle() {
        support.PracticeAssertions.verify(solver);
    }
}
