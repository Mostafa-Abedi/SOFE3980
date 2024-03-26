import org.example.CharacterCounter;
import org.junit.jupiter.api.Test;
import static org.example.CharacterCounter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCounterTest {

    @Test
    public void testCountOccurrences_Path1() {
        char[] charArray = {'a', 'b', 'a', 'c', 'd'};
        char target = 'a';
        int expected = 2;
        int actual = CharacterCounter.countOccurrences(charArray, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOccurrences_Path2() {
        char[] charArray = {'a', 'b', 'a', 'c', 'd'};
        char target = 'x';
        int expected = 0;
        int actual = CharacterCounter.countOccurrences(charArray, target);
        assertEquals(expected, actual);
    }
}
