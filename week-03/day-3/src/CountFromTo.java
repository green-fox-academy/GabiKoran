import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                            // Create a program that asks for two numbers
        System.out.println("please enter a whole number: ");
        int a = sc.nextInt();
        System.out.println("please enter another one: ");
        int b = sc.nextInt();

        if (b <= a) {                                                   // If the second number is not bigger than the first one
            System.out.println("The second number should be bigger");   // it should print: "The second number should be bigger"
        } else {                                                        // If it is bigger
            while (a <= b) {                                            // it should count from the first number to the second by one
                System.out.println(a);
                a++;
            }
        }
    }
}
