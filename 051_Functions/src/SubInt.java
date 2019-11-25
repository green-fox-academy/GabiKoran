
import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String number = sc.next();
        System.out.println();
        int[] array = {1, 11, 34, 52, 61};

        printSubInt(number, array);
    }

    public static void printSubInt (String number, int[] array ) {
        String print = "";
        String[] elements = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            elements[i] = Integer.toString(array[i]);
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i].toString().contains(number)) {
                print += i + ", ";
            }
        }

        if (print.equals("")) {
            System.out.println("[]");
        } else {
            String print2 = "[" + print.substring(0, print.length() - 2) + "]";
            System.out.println(print2);
        }
    }
}
