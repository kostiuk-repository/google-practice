package topic17_multithreading_basics.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class Easy_05_ImmutableStateTest {
    @Test
    public void testImmutabilityAndUpdates() {
        List<String> tags = new ArrayList<>();
        tags.add("java");
        Easy_05_ImmutableState state = new Easy_05_ImmutableState(10, tags);
        
        // Mutating original tags should not affect the state class list
        tags.add("concurrency");
        assertEquals(1, state.getTags().size());
        assertEquals("java", state.getTags().get(0));
        
        // Checking return of a new object upon updates
        Easy_05_ImmutableState updated = state.updateValue(20);
        assertNotSame(state, updated);
        assertEquals(10, state.getValue());
        assertEquals(20, updated.getValue());
        
        // Ensure collections retrieved are read-only
        assertThrows(UnsupportedOperationException.class, () -> state.getTags().add("new"));
    }
}
