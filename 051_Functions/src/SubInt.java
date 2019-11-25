
import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
//        int number = sc.nextInt();
        String number = sc.next();
        System.out.println();
        int[] array = {1, 11, 34, 52, 61};

//        int n = 5;
//        String nu = String.valueOf(n);
        String print = "";
        String[] elements = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            elements[i] = Integer.toString(array[i]);
        }
//        System.out.println(Arrays.toString(elements));
        for (int i = 0; i < elements.length; i++) {
            if (elements.toString().contains(number)) {
                print += i;
            }
        }
        System.out.println(print);
    }
}
