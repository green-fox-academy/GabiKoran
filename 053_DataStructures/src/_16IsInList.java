import java.util.*;

public class _16IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
    }

    private static boolean checkNums(ArrayList<Integer> listName) {
        boolean isInList4 = false;
        boolean isInList8 = false;
        boolean isInList12 = false;
        boolean isInList16 = false;
        for (int i = 0; i < listName.size(); i++) {
            if (listName.get(i) == 4) {
                isInList4 = true;
            } else if (listName.get(i) == 8) {
                isInList8 = true;
            } else if (listName.get(i) == 12) {
                isInList12 = true;
            } else if (listName.get(i) == 16) {
                isInList16 = true;
            }
        }
        if (isInList4 && isInList8 && isInList12 && isInList16) {
            return true;
        } else {
            return false;
        }
    }
}