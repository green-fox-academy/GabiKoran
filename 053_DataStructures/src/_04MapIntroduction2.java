import java.util.HashMap;
import java.util.Map;

public class _04MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> catalogue = new HashMap<>();
        catalogue.put("978-1-60309-452-8", "A Letter to Jo");
        catalogue.put("978-1-60309-459-7",	"Lupus");
        catalogue.put("978-1-60309-444-3",	"Red Panda and Moon Bear");
        catalogue.put("978-1-60309-461-0",	"The Lab");

        //System.out.println(catalogue);
//        Print all the key-value pairs in the following format
        printHashMap(catalogue);

        // Remove the key-value pair with key 978-1-60309-444-3
        catalogue.remove("978-1-60309-444-3");
        printHashMap(catalogue);

        // Remove the key-value pair with value The Lab
        String searchedKey = "";
        for (Map.Entry<String, String> element : catalogue.entrySet()) {
            if (element.getValue() == "The Lab") {
                searchedKey = element.getKey();
            }
        }
        catalogue.remove(searchedKey);
        printHashMap(catalogue);

        // Add the following key-value pairs to the map
        catalogue.put("978-1-60309-450-4",	"They Called Us Enemy");
        catalogue.put("978-1-60309-453-5",	"Why Did We Trust Him?");

        // Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.print("Is there an associated value with key 478-0-61159-424-8: ");
        if (catalogue.get("478-0-61159-424-8") != null) {
            System.out.println("Yes, there is.");
        } else {
            System.out.println("No, there isn't.");
        }
        System.out.println();

        // Print the value associated with key 978-1-60309-453-5
        System.out.println("A 978-1-60309-453-5 katalógusszámú könyv: " + catalogue.get("978-1-60309-453-5"));
    }

    public static void printHashMap (HashMap<String, String> nameOfIt) {
        for (Map.Entry<String, String> element : nameOfIt.entrySet()) {
            System.out.printf("%s (ISBN: %s)\n", element.getValue(), element.getKey());
        }
        System.out.println();
    }

}
