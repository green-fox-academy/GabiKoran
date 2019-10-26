import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please guess the number: ");
        int b = 8;
        int a = sc.nextInt();
        System.out.println(a);

        while (a != b) {
            if (a < b) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stored number is lower");
            }
            System.out.print("Please guess the number again: ");
            a = sc.nextInt();
            System.out.println(a);
        }
        System.out.println("You found the number: 8");

    }
}
