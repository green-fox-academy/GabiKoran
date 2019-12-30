public class Anagram {

    boolean isAnagram;

    public static boolean isAnagram (String input1, String input2) throws StringsHaventTheSameLengthsException {
        if (input1.length() != input2.length()) {
            throw new StringsHaventTheSameLengthsException();
        } else {
            String temp = "";
            for (int i = 0; i < input1.length(); i++) {
                temp += input1.charAt(input1.length()-1-i);
            }
            return temp.equals(input2);
        }
    }
}
