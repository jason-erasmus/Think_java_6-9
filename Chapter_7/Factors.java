public class Factors {

    public static boolean areFactors(int[] list, int n) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0 || n % list[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 5 };
        int n = 10;
        System.out.println(areFactors(list, n));

    }
}
