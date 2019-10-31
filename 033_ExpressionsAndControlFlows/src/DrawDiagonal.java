import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What sized squere/diadonal do you want");
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();

/*
        if (a == 1) {
            System.out.println("*");
        } else {

            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
  */
            for (int i = 0; i < (a - 2); i++) {
                System.out.print("*");


                for (int j = 0; j < (a - 2); j++) {
                    for (int k = 0; k <= j; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int l = j; l > 0; l--) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println("");
            }
  /*
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        }
}