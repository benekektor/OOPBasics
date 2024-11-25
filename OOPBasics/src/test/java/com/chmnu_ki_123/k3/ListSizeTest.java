import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListSizeTest {

    @Test
    public void testListSize() {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair"));
        int size = words.size();
        assertEquals(6, size);
    }
}
