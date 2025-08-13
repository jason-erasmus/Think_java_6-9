package Chapter_7;

public class PrimeFactors {

    public static boolean arePrimeFactors(int[] array, int n) {
        int product = 1;
        for (int num : array) {
            if (!isPrime(num)) {
                return false;
            }
            product *= num;
        }
        return product == n;
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = { 2, 3, 5 };
        int n = 30;
        System.out.println(arePrimeFactors(list, n));

    }
}
