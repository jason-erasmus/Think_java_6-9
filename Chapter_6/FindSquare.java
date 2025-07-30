import java.util.Scanner;

public class FindSquare {

    public static double squareRoot(double a) {
        double x0 = a / 2;
        double x1 = (x0 + a / x0) / 2;

        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + a / x0) / 2;
        }
        return x1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a number to find its square root: ");
        double number = in.nextDouble();

        double result = squareRoot(number);
        System.out.println("The square root of " + number + " is " + result);
    }
}