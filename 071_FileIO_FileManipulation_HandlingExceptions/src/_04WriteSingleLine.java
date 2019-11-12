import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class _04WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        String myName = "Gabi Koran";
        Path filePath = Paths.get("assets/my-file.txt");
        List<String> myFileOriginalContent = new ArrayList<>();
        try {
            myFileOriginalContent = Files.readAllLines(filePath);
            myFileOriginalContent.add(myName);
            Files.write(filePath, myFileOriginalContent);
        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}