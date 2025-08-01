import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean checkAnagram(String string1, String string2) {

        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        if (string1.length() != string2.length())
            return false;

        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two words or phrases to check if they are anagrams.");
        System.out.print("First entry: ");
        String string1 = in.nextLine();
        System.out.print("Second entry: ");
        String string2 = in.nextLine();

        System.out.println("Are \"" + string1 + "\" and \"" + string2 + "\" anagrams? " +
                checkAnagram(string1, string2));
    }

}
