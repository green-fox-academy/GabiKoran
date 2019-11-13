import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class _09Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        Path filePath = Paths.get("assets/log.txt");
        List<String> logs = new ArrayList<>();

        try {
            logs = Files.readAllLines(filePath);
        } catch (Exception ex) {
            System.out.println("valami gigszi van, de legalább nem errorozik");
        }
        String[] IPAdresses = new String[logs.size()];
        for (int i = 0; i < logs.size(); i++) {
            for (int j = 27; j < 38; j++) {
                System.out.print(logs.get(i).charAt(j));
            }
            System.out.println();
        }
    }
}
