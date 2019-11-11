import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class _02PrintEachLine {
    public static void main(String[] args) throws IOException {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        Path filePath = Paths.get("assets/my-file.txt");
        List<String> Lines = new ArrayList<String>();
        try {
            Lines = Files.readAllLines(filePath);
            for (String line :Lines) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            System.out.println("Unable to read file: my-file.txt");
        }
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
    }
}