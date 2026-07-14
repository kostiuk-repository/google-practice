package topic04_hash_tables.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Medium_04_DesignTwitterTest {
    private final Medium_04_DesignTwitter solver = new Medium_04_DesignTwitter();

    @Test
    public void testPostTweet() {
        support.PracticeAssertions.verify(solver);
    }

    @Test
    public void testGetNewsFeed() {
        support.PracticeAssertions.verify(solver);
    }

    @Test
    public void testFollow() {
        support.PracticeAssertions.verify(solver);
    }

    @Test
    public void testUnfollow() {
        support.PracticeAssertions.verify(solver);
    }
}
