package Chapter_9;

public class Test {

    public static void main(String[] args) {
        String str = "Test";
        char ch = 'A';
        int num = 42;
        double dub = 2.5;

        System.out.println("String + char = " + (str + ch));
        System.out.println("String + int = " + (str + num));
        System.out.println("String + double = " + (str + dub));

        System.out.println("Integer + char = " + (num + ch));
        System.out.println("Integer + double = " + (num + dub));

        System.out.println("Double + char = " + (dub + ch));

        System.out.println("Char++ = " + (ch++));
        // System.out.println("Char++ = " + (ch = ch + 1));
        System.out.println("Empty String + 5 = " + ("" + 5));
    }
}
