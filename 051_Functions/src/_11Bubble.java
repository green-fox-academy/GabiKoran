import java.util.Arrays;

public class _11Bubble {
    public static void main(String[] args) {

        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[] {34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }
    public static int[] bubble(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static int[] advancedBubble(int[] array, boolean bool) {
        int n = array.length;
        int temp = 0;
        if (bool == false) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (array[j - 1] > array[j]) {
                        //swap elements
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } else if (bool == true) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (array[j - 1] < array[j]) {
                        //swap elements
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
