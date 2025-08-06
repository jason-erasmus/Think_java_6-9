import java.util.Arrays;

public class Range {

    public static int maxInRange(int[] n, int lowIndex, int highIndex) {

        if (lowIndex == highIndex) {
            return n[lowIndex];
        }
        int index = (lowIndex + highIndex) / 2;
        int leftIndex = maxInRange(n, lowIndex, index);
        int rightIndex = maxInRange(n, index + 1, highIndex);

        if (leftIndex > rightIndex) {
            return leftIndex;
        } else {
            return rightIndex;
        }

    }

    public static int max(int[] n) {
        return maxInRange(n, 0, n.length - 1);
    }

    public static void main(String[] args) {
        int[] testArray = { 3, 8, 2, 10, 4, 6 };
        // int result = maxInRange(testArray, 1, 4);
        System.out.println("Max value in range: " + max(testArray));

    }

}

// range low and high
// low < high
//