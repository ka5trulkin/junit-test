import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        String message = "1 2 3 + +";

        assertEquals(6, calculator.calculatePolishNotation(message));
    }

    @Test
    public void shouldCalculateSubtraction() {
        String message = "6 3 2 + -";

        assertEquals(1, calculator.calculatePolishNotation(message));
    }

    @Test
    public void shouldCalculateMultiplication() {
        String message = "2 1 3 2 - + *";

        assertEquals(4, calculator.calculatePolishNotation(message));
    }

    @Test
    public void shouldCalculateWithNegativeNumber() {
        String message = "2 1 3 2 * - +";

        assertEquals(-3, calculator.calculatePolishNotation(message));
    }

    @Test
    public void shouldCalculateWithMultipleSpaces() {
        String message = "2  1   3    2      *      -         +";

        assertEquals(-3, calculator.calculatePolishNotation(message));
    }
}