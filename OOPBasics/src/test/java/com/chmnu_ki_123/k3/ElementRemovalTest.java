import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ElementRemovalTest {

    @Test
    public void testRemoveLastElement() {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair"));
        if (!words.isEmpty()) {
            words.remove(words.size() - 1);
        }
        assertEquals(5, words.size());
        assertFalse(words.contains("armchair"));
    }
}
