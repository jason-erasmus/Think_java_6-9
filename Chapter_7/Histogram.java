public class Histogram {

    public static int[] letterHist(String input) {
        int[] histogram = new int[26];

        for (char ch : input.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            if (lower >= 'a' && lower <= 'z') {
                histogram[lower - 'a']++;
            }
        }

        return histogram;
    }

    public static void main(String[] args) {

        String sample = "The quick brown fox jumps over the lazy dog";
        int[] result = letterHist(sample);

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'a') + ": " + result[i]);
        }

    }
}
