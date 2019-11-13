import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class _08ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        Path filePath = Paths.get("assets/reversed-lines.txt");
        List<String> originalLines = new ArrayList<>();
        List<String> decryptedLines = new ArrayList<>();
        String decryptedText = "";
        try {
            originalLines = Files.readAllLines(filePath);
            for (int i = 0; i < originalLines.size(); i++) {
                decryptedLines.add(originalLines.get(i));
                for (int j = originalLines.get(i).length(); j > 0; j--) {
                    decryptedText += decryptedLines.get(i).charAt(j - 1);
                }
                decryptedText += "\n";
            }
            System.out.println(decryptedText);
        } catch (Exception ex) {
            System.out.println("valami gigszi van, de legalább nem errorozik");
        }
    }
}