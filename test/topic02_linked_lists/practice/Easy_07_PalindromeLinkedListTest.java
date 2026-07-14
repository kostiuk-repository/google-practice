package topic02_linked_lists.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_07_PalindromeLinkedListTest {
    private final Easy_07_PalindromeLinkedList solver = new Easy_07_PalindromeLinkedList();

    @Test
    public void testIsPalindrome() {
        support.PracticeAssertions.verify(solver);
    }
}
