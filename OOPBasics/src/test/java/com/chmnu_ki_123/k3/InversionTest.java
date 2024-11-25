import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class InversionTest {

    @Test
    public void testReverseList() {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair"));
        Collections.reverse(words);
        assertEquals("armchair", words.get(0));
        assertEquals("book", words.get(words.size() - 1));
    }
}
