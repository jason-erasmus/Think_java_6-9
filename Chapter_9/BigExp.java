import java.math.BigInteger;

public class BigExp {

    public static BigInteger pow(int x, int n) {
        if (n == 0)
            return BigInteger.ONE;

        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);

        BigInteger result = t.multiply(t);
        if (n % 2 == 1) {
            result = result.multiply(BigInteger.valueOf(x));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(1000, 500));
    }

}
