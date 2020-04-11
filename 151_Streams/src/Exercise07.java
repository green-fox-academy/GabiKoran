import java.util.Arrays;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        cities.stream()
                .map(t -> (String) t)
                .filter(t -> t.startsWith("R"))
                .forEach(t -> System.out.println(t));

        cities.stream()
                .map(t -> (String) t)
                .filter(t -> t.startsWith("C"))
                .forEach(System.out::println);
    }
}
