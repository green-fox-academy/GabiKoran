import java.util.Scanner;

public class _01DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        divide10WithTheScanneredNumber(divisor);
    }

    public static void divide10WithTheScanneredNumber (int divisor) {
       try {
           System.out.println(10 / divisor);
       } catch (ArithmeticException aritmExc) {
           System.out.println("You can't divide with 0");
       }
    }
}
