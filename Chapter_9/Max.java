package Chapter_9;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        if (args.length == 0) {
            System.out.println("Usage: java Max <number>");
            return;
        }
        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);
    }
}
