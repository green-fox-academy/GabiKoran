import java.util.List;
import java.util.stream.Collectors;

public class Exercise06 {

    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!
        String text = "KisEsNagyBetuk";
        String[] stringArray = text.split("");
        char[] characters = text.toCharArray();
        text.chars()
                .filter(c -> Character.isUpperCase(c))
                .mapToObj(c -> (char) c)
                .forEach(System.out::println);

        List<Character> UpperCaseCharacterList = text.chars()
                .filter(c -> Character.isUpperCase(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println(UpperCaseCharacterList);
    }
}
