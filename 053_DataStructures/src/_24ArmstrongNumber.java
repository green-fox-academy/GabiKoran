import java.util.Arrays;
import java.util.Scanner;

public class _24ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String givenString = scanner.next();

        String[] givenDetails = givenString.split("");
        int sum = 0;
        for (int i = 0; i < givenDetails.length; i++) {
            sum += Math.pow(convertStringToInt(givenDetails[i]), givenDetails.length);
        }
        int givenNumber = convertStringToInt(givenString);

        if (givenNumber == sum) {
            System.out.println("The " + givenNumber + " is an Armstrong number.");
        } else {
            System.out.println("The " + givenNumber + " is NOT an Armstrong number.");
        }
    }

    private static int convertStringToInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.err.println("It's not a number");
            System.exit(-1);
            return -1;
        }
    }
}
