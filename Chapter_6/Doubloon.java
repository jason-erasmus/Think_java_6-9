import java.util.Scanner;

public class Doubloon {

    public static boolean isDoubloon(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++) {
            char c = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    count++;
                }
            }
            if (count != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Check if word is a doubloon: ");
        String word = in.next();
        boolean result = isDoubloon(word);
        System.out.println(result);

    }

}
