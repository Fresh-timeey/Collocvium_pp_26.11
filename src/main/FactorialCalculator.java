import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {

    public List<BigInteger> calculateFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The input must be a natural number greater than 0.");
        }

        List<BigInteger> factorials = new ArrayList<>();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            factorials.add(factorial);
        }

        return factorials;
    }
}
