import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                    // Write a program that asks for two numbers
        System.out.println("Please enter the number of girls: ");
        int girls = sc.nextInt();                               // The first number represents the number of girls that comes to a party,
        System.out.println("Please enter the number of boys: ");
        int boys = sc.nextInt();                                // the second the boys

        if (girls == 0) {                                       // If no girls are coming, regardless the count of the people
            System.out.println("Sausage party");                // It should print: Sausage party
        } else if ((girls == boys) && ((girls + boys) >= 20)) { // If the the number of girls and boys are equal and 20 or more people are coming to the party
            System.out.println("The party is excellent!");      // It should print: The party is excellent!
        } else if (((girls + boys) >= 20) && (girls != boys)) { // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
            System.out.println("Quite cool party!");            // It should print: Quite cool party!
        } else if ((girls + boys) < 20) {                       // If there are less people coming than 20
            System.out.println("Average party");                // It should print: Average party...
        }
    }
}
