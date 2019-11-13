import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class _08ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        Path filePath = Paths.get("assets/reversed-order.txt");
        List<String> origiText = new ArrayList<>();
//        List<String> decryptedText = new ArrayList<>();
        String decryptedString = "";
        try {
            origiText = Files.readAllLines(filePath);
        } catch (Exception ex) {
            System.out.println("valami gigszi van, de legalább nem errorozik");
        }
        for (int i = origiText.size(); i > 0; i--) {
//            decryptedText.add(origiText.get(i));
            decryptedString += origiText.get(i);
        }
        System.out.println(decryptedString);
    }
}