public class _05Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        System.out.println(totalNumberOfEars(16));
    }
    public static int totalNumberOfEars (int i) {
        if (i == 0) {
            return 0;
        }
        return 2 + totalNumberOfEars(i - 1);
    }
}
