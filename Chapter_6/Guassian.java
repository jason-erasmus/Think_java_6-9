package Chapter_6;

public class Guassian {

    public static double guass(double x, int n) {
        double a = 0.0;
        double term = 1.0;
        int sum = 1;

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                term = term * x * x / i;
            }
            a += sum * term;
            sum *= -1;
        }
        return a;
    }

    public static void main(String[] args) {
        double result = guass(2, 10);
        System.out.println("Answer is " + result);
    }

}
