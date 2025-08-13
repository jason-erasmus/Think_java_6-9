package Chapter_8;

public class OddSum {

    public static int oddSum(int n) {
        if (n <= 0)
            return 0;
        if (n % 2 == 1) {
            return n + oddSum(n - 2);
        } else {
            return oddSum(n - 1);
        }
    }

    public static void main(String[] args) {
        int sum = oddSum(9);
        System.out.println(sum);
    }
}
