import java.util.Arrays;

public class _08ConvertToDouble {
    public static void main(String[] args) {
        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        int numList[] = {3, 4, 5, 6, 7};
        // - Double all the values in the array
        double[] numListDouble = new double[numList.length];
        for (int i = 0; i < numList.length; i++) {
            numListDouble[i] = numList[i];
        }

        System.out.println(Arrays.toString(numListDouble));

    }
}