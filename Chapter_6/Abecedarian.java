import java.util.Scanner;

public class Abecedarian {

    public static boolean isAbecedarian(String word) {

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Check if your word is abecedarian: ");
        String word = in.next();
        boolean result = isAbecedarian(word);
        System.out.println(result);
    }
}
