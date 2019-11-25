public class _08Anagram {
    public static void main(String[] args) {
        String input1 = "dog";
        String input2 = "god";

        System.out.println(anagram(input1, input2));
    }

    public static boolean anagram (String input1, String input2) {
        String temp = "";
        for (int i = 0; i < input1.length(); i++) {
            temp += input1.charAt(input1.length()-1-i);
        }
        return temp.equals(input2);
    }
}
