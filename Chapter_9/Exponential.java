import java.math.BigInteger;

public class Exponential {

    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Math Error");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
    }

    public static double myExp(double x, int n) {

        double result = 1.0;
        double formula = 1.0;

        for (int i = 1; i <= n; i++) {
            formula *= x / i;
            result += formula;
        }

        // 1 + x + (x * n) / 2;
        return result;

    }

    public static void main(String[] args) {
        double x = 1;
        int n = 10;

        System.out.println(myExp(x, n));
        System.out.println(Math.exp(x));
    }
}
