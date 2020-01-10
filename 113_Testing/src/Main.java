import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.asList('a', 'u', 'o', 'e', 'i').contains('a'));
        Extension extension = new Extension();
        System.out.println(extension.isVowel('a'));
    }
}
