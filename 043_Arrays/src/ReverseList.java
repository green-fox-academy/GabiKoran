import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        int aj[] = {3, 4, 5, 6, 7};
        // - Reverse the order of the elements in `aj`
        int ajReverse[] = new int[aj.length];

        for (int i = 0; i < aj.length; i++) {
            ajReverse[i] = aj[aj.length - 1 - i];
        }

        for (int i = 0; i < aj.length; i++) {
            aj[i] = ajReverse[i];
        }

        // - Print the elements of the reversed `aj`
        System.out.println(Arrays.toString(aj));
    }
}
