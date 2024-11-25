import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParallelogramTest {

    @Test
    public void testCalculateArea() {
        Parallelogram parallelogram = new Parallelogram(5, 10, 7);
        assertEquals(50, parallelogram.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Parallelogram parallelogram = new Parallelogram(5, 10, 7);
        assertEquals(24, parallelogram.calculatePerimeter());
    }

    @Test
    public void testEquals() {
        Parallelogram parallelogram1 = new Parallelogram(5, 10, 7);
        Parallelogram parallelogram2 = new Parallelogram(5, 10, 7);
        assertTrue(parallelogram1.equals(parallelogram2));
    }

    @Test
    public void testNotEquals() {
        Parallelogram parallelogram1 = new Parallelogram(5, 10, 7);
        Parallelogram parallelogram2 = new Parallelogram(6, 10, 7);
        assertFalse(parallelogram1.equals(parallelogram2));
    }
}
