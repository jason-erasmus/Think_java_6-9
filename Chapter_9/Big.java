import java.math.BigInteger;

public class Big {

    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Math Error");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            System.out.printf("%2d = %d%n", i, result);
        }
    }

    public static void main(String[] args) {
        factorial(1);
    }
}
