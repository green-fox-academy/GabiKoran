import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();
        System.out.println("Please enter another one: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is the bigger one.");
        } else {
            System.out.println(b + " is the bigger one.");
        }
    }
}
