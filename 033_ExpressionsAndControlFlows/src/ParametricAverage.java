import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to enter a numbers? y/n ");
        String scannerInput = sc.next();
        int sum = 0;
        int counter = 0;
        while (scannerInput.equals("y")) {
            System.out.println("Please enter a whole number: ");
            int a = sc.nextInt();
            sum += a;
            counter++;
            System.out.println("Would you like to enter more numbers? y/n ");
            scannerInput = sc.next();
        }
        if (counter == 0) {
            System.out.println("You haven't entered any numbers.");
        } else {
            System.out.printf("You entered %d numbers \nwith an average of %f \nand a total of %d.", counter, (double) sum / counter, sum);
        }
    }
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
}
