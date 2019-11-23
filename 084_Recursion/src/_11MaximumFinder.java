import java.lang.reflect.Array;
import java.util.Arrays;

public class _11MaximumFinder {
    public static void main(String[] args) {
        //Write a function that finds the largest element of an array using recursion.
        int A[] = {7, 4, 1, 9, 2, 5, 3, 6, 8, 0};
        System.out.println(A.length);

        // for ciklussal:           //!!!NINCS MEG!!!, csak belekezdtem
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println(max);

    }

//    public static int MaximumFinder(Array[] name) {
//        Array[] B = new Array[name.length - 1];
//    }
}
