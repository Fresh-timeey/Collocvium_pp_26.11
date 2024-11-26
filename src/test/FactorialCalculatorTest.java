import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import java.util.List;

public class FactorialCalculatorTest {

    @Test
    void testCalculateFactorials() {
        FactorialCalculator calculator = new FactorialCalculator();
        List<BigInteger> result = calculator.calculateFactorials(5);

        assertEquals(5, result.size());
        assertEquals(BigInteger.ONE, result.get(0));                      // 1!
        assertEquals(BigInteger.TWO, result.get(1));                      // 2!
        assertEquals(BigInteger.valueOf(6), result.get(2));               // 3!
        assertEquals(BigInteger.valueOf(24), result.get(3));              // 4!
        assertEquals(BigInteger.valueOf(120), result.get(4));             // 5!
    }

    @Test
    void testInvalidInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFactorials(0);
        });
        assertEquals("The input must be a natural number greater than 0.", exception.getMessage());
    }

    @Test
    void testLargeInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        List<BigInteger> result = calculator.calculateFactorials(20);
        assertEquals(new BigInteger("2432902008176640000"), result.get(19));  // 20!
    }
}
