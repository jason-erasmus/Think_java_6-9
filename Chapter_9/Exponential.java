package Chapter_9;

public class Exponential {

    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Math Error");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
            System.out.printf("%2d = %d%n", i, result);
        }
    }

    public static void check(double x, int n) {
        // int n = 1;
        double estimate = myExp(x, n);
        double actual = Math.exp(x);
        // System.out.println(x + "\t" + estimate + "\t" + actual);

        // convert float to string for easier loop comparison
        String estimateStr = String.format("%.20f", estimate);
        String actualStr = String.format("%.20f", actual);

        int count = 0;
        for (int i = 0; i < estimateStr.length() && i < actualStr.length(); i++) {
            if (estimateStr.charAt(i) == actualStr.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        System.out.println("x=" + x + " n=" + n + "\t" + "Digits matching: " + count);

    }

    public static double myExp(double x, int n) {

        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            result += term;
        }

        // 1 + x + (x * n) / 2;
        return result;

    }

    public static void main(String[] args) {
        // double x = 1;
        int n = 20;

        // System.out.println(myExp(x, n));
        // System.out.println(Math.exp(x));

        // for (double x = 0.1; x <= 100; x *= 10) {
        // check(x, n);
        // }
        for (double x = -0.1; x >= -100; x *= 10) {
            System.out.println(myExp(x, n));
        }
    }
}
