import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class _03CountLines {
    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        String fileName = "my-file.txt";
        returnsTheNumberOfLinesOfTheFile(fileName);
    }
    public static void returnsTheNumberOfLinesOfTheFile (String filename) {
        Path filePath = Paths.get("assets/" + filename);
        List<String> Lines = new ArrayList<>();
        try {
            Lines = Files.readAllLines(filePath);
            System.out.println(Lines.size());
            // It should return zero if it can't open the file, and
            // should not raise any error.
        } catch (NoSuchFileException noSuchFileException) { // NoSuchFileException
            System.out.println("0");
        } catch (IOException IOExc) {
            System.out.println("00");
        }
    }
}
