package Chapter_7;

import java.util.Random;
import java.util.Arrays;

public class IndexMax {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
        }
        return list;
    }

    public static int indexOfMax(int[] x) {
        int max = x[0];
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
                index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] array = randomArray(10);
        System.out.println(Arrays.toString(array));
        int index = indexOfMax(array);
        int value = array[index];
        System.out.println("The max value is " + value + " it's index is " + index);
    }
}
