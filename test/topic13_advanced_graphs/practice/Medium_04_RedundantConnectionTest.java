package topic13_advanced_graphs.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_04_RedundantConnectionTest {
    private final Medium_04_RedundantConnection solver = new Medium_04_RedundantConnection();

    @Test
    public void testFindRedundantConnection() {
        support.PracticeAssertions.verify(solver);
    }
}
