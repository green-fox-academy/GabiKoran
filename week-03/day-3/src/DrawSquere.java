import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DrawSquere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What sized squere do you want");
        System.out.println("Please enter a whole number: ");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("*");
        } else {

        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < (a - 2); i++) {
            System.out.print("*");
            for (int j = 0; j < (a - 2); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();


        }
    }
}
