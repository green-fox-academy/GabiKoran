import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise10 {

    public static void main(String[] args) {

        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Vuk", "green", 6));
        foxes.add(new Fox("Csele", "green", 4));
        foxes.add(new Fox("Karak", "red", 21));
        foxes.add(new Fox("Kag", "orange", 12));
        foxes.add(new Fox("Íny", "orange", 11));

        foxes.stream()
                .filter(f -> f.getColor().equals("green"))
                .forEach(f -> System.out.print(f.getName() + " "));

        System.out.println();

        foxes.stream()
                .filter(f -> f.getColor().equals("green"))
                .filter(f -> f.getAge() < 5)
                .forEach(f -> System.out.println(f.getName()));

        Map<String, Long> foxesByColor = foxes.stream()
                .map(f -> f.getColor())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(foxesByColor);

    }
}
