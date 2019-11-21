public class xP00Factorial {
    public static void main(String[] args) {
        System.out.println(factorialWithLoop(4));
        System.out.println(factorialWithRecursion(4));
    }

    public static int factorialWithLoop(int n) {
        int factorial = 1;
        for (int i = 1; i  < n + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }
    }
}
