import java.util.Scanner;

public class Scrabble {

    public static boolean canSpell(String tiles, String word) {
        word = word.toLowerCase();
        tiles = tiles.toLowerCase();
        boolean[] used = new boolean[tiles.length()];

        for (int i = 0; i < word.length() - 1; i++) {
            boolean found = false;

            for (int j = 0; j < tiles.length(); j++) {
                if (word.charAt(i) == tiles.charAt(j) && !used[j]) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Check if your tiles can spell a word");
        System.out.print("Enter characters for tiles: ");
        String tiles = in.next();
        System.out.print("Now enter the word: ");
        String word = in.next();
        boolean result = canSpell(tiles, word);
        System.out.println(result);

    }

}
