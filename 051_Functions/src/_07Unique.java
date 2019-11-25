import java.util.*;

public class _07Unique {
    public static void main(String[] args) {

        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34});
        //  should print: `[1, 11, 34, 52, 61]`
        //''''''''''''''' NEM JÓ''''''''''''''''''''
    }

    public static void unique(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intArray[i] == intArray[j]) {
                    for (int k = j; k < n - 1; k++) {
                        intArray[k] = intArray[k + 1];
                    }
                    n--;
                } else {
                    j++;
                }
            }
        }
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = intArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}

