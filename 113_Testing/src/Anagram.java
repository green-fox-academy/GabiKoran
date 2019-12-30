import java.util.Arrays;

public class Anagram {

    boolean isAnagram;

    public static boolean isAnagram(String input1, String input2) throws NullPointerException{
        boolean isAnagram = false;
        if (input1 == null || input2 == null) {
            System.err.println("At least one of the String input is missing.\n");
            throw new NullPointerException();
        } else {
            input1 = input1.replaceAll("\\s", "");
            input2 = input2.replaceAll("\\s", "");
            if (input1.length() != input2.length()) {
                System.err.println("These Strings does not have the same lengths, so they can't be anagram.\n");
            } else {
                char[] input1Array = input1.toCharArray();
                char[] input2Array = input2.toCharArray();
                Arrays.sort(input1Array);
                Arrays.sort(input2Array);
                isAnagram = Arrays.toString(input1Array).equals(Arrays.toString(input2Array));
            }
        }
        return isAnagram;
    }
}
