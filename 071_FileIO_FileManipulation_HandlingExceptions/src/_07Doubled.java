import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class _07Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path filePath = Paths.get("assets/duplicated-chars.txt");
        List<String> originFileContent = new ArrayList<>();
        List<String> decryptedFileLines = new ArrayList<>();
        String decryptedText = "";
        try {
            originFileContent = Files.readAllLines(filePath);
        } catch (Exception ex) {
            System.out.println("valami gigszi van, de legalább nem errorozik");
        }

        for (int i = 0; i < originFileContent.size(); i++) {
            decryptedFileLines.add(originFileContent.get(i));
            for (int j = 0; j < decryptedFileLines.get(i).length(); j+=2) {
                decryptedText += decryptedFileLines.get(i).charAt(j);
            }
            decryptedText += "\n";
        }
        System.out.println(decryptedText);

    }
}