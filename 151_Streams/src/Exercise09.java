import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise09 {

    public static void main(String[] args) {

        String inputText = "Egyszer volt, hol nem volt, volt egyszer egy...";

        List<String> listOfText = Arrays.asList(inputText.split(""));
        Set<String> letters = listOfText.stream()
                .collect(Collectors.toSet());

        System.out.println(letters);


        Map<Character, Long> lettersCount = inputText.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(lettersCount);

    }
}
