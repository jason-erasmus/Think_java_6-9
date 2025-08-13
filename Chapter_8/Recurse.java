package Chapter_8;

public class Recurse {
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all bit the first and last letter of the String
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void printBackward(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.length() <= 1 || s.charAt(0) == s.charAt(1)) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));

    }

    public static void main(String[] args) {
        String test = "Lachryma";
        String palindrome = "Rotator";
        // System.out.println(first(test));
        // System.out.println(rest(test));
        // System.out.println(middle(test));
        // System.out.println(length(test));
        printString(test);
        printBackward(test);
        System.out.println(reverseString(test));
        System.out.println("Is the word Rotator a palindrome? " + isPalindrome(palindrome));

    }
}
