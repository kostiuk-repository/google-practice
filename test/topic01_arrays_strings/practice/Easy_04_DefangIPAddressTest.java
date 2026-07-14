package topic01_arrays_strings.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Easy_04_DefangIPAddressTest {
    private final Easy_04_DefangIPAddress solver = new Easy_04_DefangIPAddress();

    @Test
    public void testDefangIPaddr() {
        support.PracticeAssertions.verify(solver);
    }
}
