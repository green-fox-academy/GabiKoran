import java.util.Scanner;

public class _05Factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();
        System.out.println("Factorial of your number: " + factorio(input));

        // - Create a function called `factorio`
        //   that returns it's input's factorial
    }
    public static int factorio(int in) {
        int result = in;
        for (int i = 0; i < (in - 1); i++) {
            result *= (in - 1 - i);
        }
        return result;
    }
}
