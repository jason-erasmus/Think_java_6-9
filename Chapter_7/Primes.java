import java.util.Arrays;

public class Primes {

    public static boolean[] sieve(int n) {

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int j = 2; j * j <= n; j++) {
            if (isPrime[j]) {
                for (int i = j * j; i <= n; i += j) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        int limit = 50;
        boolean[] primes = sieve(limit);

        for (int i = 2; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
