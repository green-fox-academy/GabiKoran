import java.util.Scanner;

public class _04Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();
        System.out.print("The sum of numbers from zero to your number: ");
        System.out.println(sum(input));
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
    }
    public static int sum(int in) {
        int summ = 0;
        if (in >= 0) {
            for (int i = 0; i <= in; i++) {
                summ += i;
            }
        } else {
            for (int i = 0; i >= in ; i--) {
                summ += i;
            }
        }
        return summ;
    }
}
