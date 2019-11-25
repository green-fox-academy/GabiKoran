public class _09PalindromeBuilder {
    public static void main(String[] args) {
        String input = "indul a görög aludni ";

        System.out.println(palindromeBuilder(input));
    }

    public static String palindromeBuilder (String input) {
        String palindrome = input;
        for (int i = 0; i < input.length(); i++) {
            palindrome += input.charAt(input.length()-1-i);
        }
        return palindrome;
    }
}
