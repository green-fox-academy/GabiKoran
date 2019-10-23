import java.util.Scanner;

public class DrawDiamondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I will draw a diamond");
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j=1; j <= (a - i); j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j=0; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = (a - 1); j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
