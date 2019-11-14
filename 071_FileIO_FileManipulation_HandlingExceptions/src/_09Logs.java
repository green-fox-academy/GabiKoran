import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
        ArrayList<String> IPAdresses = new ArrayList<>();
        for (int i = 0; i < logs.size(); i++) {
            String[] lineParts = logs.get(i).split(" ");
                IPAdresses.add(lineParts[8]);
        }
        Set<String> uniqueIPs = new HashSet<String>(IPAdresses);
        int numberOfIPs = uniqueIPs.size();
        System.out.println(numberOfIPs);
        String[] uniqueIPAdresses = new String[numberOfIPs];
        System.arraycopy(uniqueIPs.toArray(), 0, uniqueIPAdresses, 0, numberOfIPs);
        System.out.println(Arrays.toString(uniqueIPAdresses));

        ArrayList<String> coloumnGetsPosts = new ArrayList<>();
        for (int i = 0; i < logs.size(); i++) {
            String[] lineParts = logs.get(i).split(" ");
            coloumnGetsPosts.add(lineParts[11]);
        }
        int sumGets = 0;
        int sumPosts = 0;
        for (int i = 0; i < coloumnGetsPosts.size(); i++) {
            System.out.println(coloumnGetsPosts.get(i));
            if (coloumnGetsPosts.get(i).equals("GET")) {
                sumGets ++;
            } else if (coloumnGetsPosts.get(i).equals("POST")) {
                sumPosts ++;
            }
        }
        System.out.println("GET/POST request ratio: " + sumGets + "/" + sumPosts);
    }
}