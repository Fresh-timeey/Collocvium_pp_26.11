import java.util.List;
import java.math.BigInteger;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            FactorialCalculator calculator = new FactorialCalculator();
            int n = 10;  // Пример ввода (можно заменить на получение от пользователя)
            List<BigInteger> factorials = calculator.calculateFactorials(n);
            System.out.println("First " + n + " factorials: " + factorials);
        } catch (IllegalArgumentException e) {
            logger.severe("Input error: " + e.getMessage());
        } catch (Exception e) {
            logger.severe("An unexpected error occurred: " + e.getMessage());
        }
    }
}
