import java.util.Arrays;
import java.util.Scanner;

public class SubIntMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println();
        int[] array = {1, 11, 34, 52, 61};

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
        String print = "";
        String[] elements = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            elements[i] = Integer.toString(array[i]);
            // String str1 = Integer.toString(a);
        }
//        for (int i = 0; i < elements.length; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }
        String print2 = "[" + print + "]";
        System.out.println(print2);



    }


}

/*
for (int j = 0; j < elements[i].length(); j++) {
                if (numberInput == elements[i]) {
                    print += i;
                }
            }
 */