import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I will draw a diamond");
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int j = 1; j <= (a - i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i*2)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (a - 1); i >= 1; i--) {
            for (int j=1; j <= a-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
