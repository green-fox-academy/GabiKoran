public class _06BunniesAgain {
    public static void main(String[] args) {

        System.out.println(totalNumbersOfEarsAgain(4));

    }

    public static int totalNumbersOfEarsAgain(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 3 + totalNumbersOfEarsAgain(n - 1);
        } else {
            return 2 + totalNumbersOfEarsAgain(n - 1);
        }
    }
}

