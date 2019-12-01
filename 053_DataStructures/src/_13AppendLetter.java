import java.util.Arrays;
import java.util.List;

public class _13AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        System.out.println(appendA(far));
    }

    private static List<String> appendA(List<String> stringName) {
        for (int i = 0; i < stringName.size(); i++) {
            stringName.set(i, stringName.get(i) + "a");
        }
        return stringName;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"