import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class SortingByLettersTest {

    @Test
    public void testSortingByLength() {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair"));
        words.sort((word1, word2) -> Integer.compare(word2.length(), word1.length()));

        assertTrue(words.get(0).length() >= words.get(1).length());
        assertTrue(words.get(1).length() >= words.get(2).length());
        assertTrue(words.get(2).length() >= words.get(3).length());
        assertTrue(words.get(3).length() >= words.get(4).length());
        assertTrue(words.get(4).length() >= words.get(5).length());
    }
}
