import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // Write a program that reads a number form the standard input,
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();

        if (a <= 0) {                           // If the number is zero or smaller
            System.out.println("Not enough");   // it should print: Not enough
        } else if (a == 1) {                    // If the number is one
            System.out.println("One");          // it should print: One
        } else if (a == 2) {                    // If the number is two
            System.out.println("Two");          // it should print: Two
        } else {                                // If the number is more than two
            System.out.println("A lot");        // it should print: A lot
        }
    }
}
