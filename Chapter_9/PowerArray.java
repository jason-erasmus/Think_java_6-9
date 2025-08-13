package Chapter_9;

import java.util.Arrays;
import java.util.Random;

public class PowerArray {

    public static void powArray(double[] a, int n) {

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], n);

        }
        System.out.println(Arrays.toString(a));
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static int[] histogram(int[] scores, int counter) {
        int[] counts = new int[counter];

        for (int score : scores) {
            if (score >= 0 && score < 100) {
                int index = (score * counter) / 100;
                counts[index]++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        double[] list = { 1.0, 2.0, 3.0, 4.0 };
        powArray(list, 3);

        int[] scores = randomArray(40);
        int counter = 10;

        int[] result = histogram(scores, counter);
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + ":" + result[i]);
        }

    }

}
