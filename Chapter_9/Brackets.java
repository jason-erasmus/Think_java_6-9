
public class Brackets {

    public static int numBrackets(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] tests = {
                "((3+7) * 2)",
                "(1 * 9) -1)",
                "((()))",
                "Nothing to see here",
                "()()()((()))",
                "()())"
        };

        for (String s : tests) {
            int isBalanced = numBrackets(s);
            System.out.println("\"" + s + "\" = Balanced: " + isBalanced);
        }
    }

}
