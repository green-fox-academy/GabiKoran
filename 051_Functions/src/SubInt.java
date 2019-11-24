import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println();
        int[] array = {1, 11, 34, 52, 61};
        System.out.println(subInt(number, array));
        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static String subInt(int numberInput, int[] arrayInput) {
        String print = "";
        for (int i = 0; i < arrayInput.length; i++) {
            if (numberInput == arrayInput[i]) {
                print += (i);
            }
        }
        return "[" + print + "]";
    }
}
