public class Binary {

    /**
     * The function recursively displays the binary representation of a given
     * integer value.
     * 
     * @param value The `displayBinary` method you provided is a recursive method
     *              that converts a decimal number to its binary representation and
     *              displays
     *              it. The method takes an integer `value` as a parameter, which
     *              represents
     *              the decimal number to be converted to binary.
     */
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static void main(String[] args) {
        displayBinary(23);
    }
}
