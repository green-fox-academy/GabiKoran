import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _10PalindromeSearcher {
    public static void main(String[] args) {
        String input = "indulagörögaludni";
        String input2 = "dog goat dad duck doodle never";

        System.out.println(palindromeSearcher(input));
        System.out.println(palindromeSearcher(input2));
    }

    public static Set<String> palindromeSearcher (String input) {
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            reversed += input.charAt(input.length()-1-i);
        }

        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 3; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes;
    }

    public static boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }
}
