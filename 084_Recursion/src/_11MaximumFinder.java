import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _11MaximumFinder {
    public static void main(String[] args) {
        //Write a function that finds the largest element of an array using recursion.
        int A[] = {7, 3, 1, 9, 2, 5, 3, 6, 8, 0, 1};
        System.out.println(A.length);
        
        // for ciklussal:
//        int max = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] > max) {
//                max = A[i];
//            }
//        }
//        System.out.println(max);

        // with recursion:
        System.out.println(maximumFinder(A));

    }

    private static int maximumFinder(int A[]) {
        if (A.length == 1) {
            return A[0];
        }
        int[] B = new int[A.length - 1];
        for (int i = 0; i < A.length - 2; i++) {
            B[i] = A[i];
        }
        if (A[A.length - 1] > A[A.length - 2]) {
            B[B.length - 1] = A[A.length - 1];
        } else {
            B[B.length - 1] = A[A.length - 2];
        }
        A = B;
        //System.out.println(Arrays.toString(A)); // csak, hogy lássam, mi történik menet közben
        return maximumFinder(A);
    }
}

