package Chapter_8;

public class Bottles {

    public static void verse(int bottlesLeft) {
        if (bottlesLeft == 0) {
            System.out.println("No bottles of beer on the wall,\n" + //
                    "no bottles of beer,\n" + //
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" + //
                    "’cause there are no more bottles of beer on the wall!");
            return;
        }

        System.out.println(bottlesLeft + " bottles of beer on the wall,");
        System.out.println(bottlesLeft + " bottles of beer,");
        System.out.println("ya' take one down, ya' pass it around,");
        System.out.println((bottlesLeft - 1) + " bottles of beer on the wall.");

        verse(bottlesLeft - 1);
    }

    public static void main(String[] args) {

        verse(3);
    }
}
