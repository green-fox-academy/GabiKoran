import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class _06CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        Path filePath = Paths.get("assets/my-file.txt");
        Path filePathCopy = Paths.get("assets/my-file-copy.txt");
        List<String> contentOfOriginFile = new ArrayList<>();
        boolean wasItSuccess = false;
        try {
            contentOfOriginFile = Files.readAllLines(filePath);
            Files.write(filePathCopy, contentOfOriginFile);
        } catch (Exception ex) {
            System.out.println("valami gigszi van, de legalább nem erroroik");
        } finally {
            wasItSuccess = Files.exists(filePathCopy);
            System.out.println(wasItSuccess);
        }
    }
}
