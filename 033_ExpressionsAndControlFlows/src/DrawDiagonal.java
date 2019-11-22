import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What sized squere/diadonal do you want");
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println();
        } else if (a == 1) {
            System.out.println("*");
        } else if (a > 1) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if ((j == 0) || (j == i) || (i == 0) || (i == a - 1) || (j == a - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}