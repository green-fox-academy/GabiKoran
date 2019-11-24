import java.util.Arrays;

public class xP01ExpandArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = i;
        }

        System.out.println(Arrays.toString(numbers));

        int[] temp = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        temp[3] = 3;
        numbers = temp;

        System.out.println(Arrays.toString(numbers));
    }
}
