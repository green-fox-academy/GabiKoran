import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class _08ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        Path filePath = Paths.get("assets/reversed-oredr.txt");
        List<String> origiText = new ArrayList<>();

        try {
            origiText = Files.readAllLines(filePath);
        } catch (Exception ex) {
            System.out.println("valami gigszi van, de legalább nem errorozik");
        }
        System.out.println(reverseText(origiText));
    }

    public static String reverseText (List<String> origiText) {
        String decryptedString = "";
        for (int i = (origiText.size() -1); i > 0; i--) {
            decryptedString += origiText.get(i) + "\n";
        }
        return decryptedString;
    }
}