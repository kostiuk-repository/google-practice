package topic04_hash_tables.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_01_ContainsDuplicateIITest {
    private final Easy_01_ContainsDuplicateII solver = new Easy_01_ContainsDuplicateII();

    @Test
    public void testContainsNearbyDuplicate() {
        support.PracticeAssertions.verify(solver);
    }
}
