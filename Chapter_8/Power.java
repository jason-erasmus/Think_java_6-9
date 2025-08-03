public class Power {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n < 0) {
            return 1 / power(x, -n);
        } else {
            return x * power(x, n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(power(2.0, 3));
    }

}
