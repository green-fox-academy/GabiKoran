import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {

//        Create a map with the following key-value pairs.
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Eggs", 200);
        priceMap.put("Milk", 200);
        priceMap.put("Fish", 400);
        priceMap.put("Apples", 150);
        priceMap.put("Bread", 50);
        priceMap.put("Chicken", 550);

//        Which products cost less than 201? (just the name)
        System.out.println("Which products cost less than 201? (just the name)");
        for (Map.Entry<String, Integer> element : priceMap.entrySet()) {
            if (element.getValue() < 201) {
                System.out.println(element.getKey());
            }
        }
        System.out.println();

//        Which products cost more than 150? (name + price)
        System.out.println("Which products cost more than 150? (name + price)");
        for (Map.Entry<String, Integer> element : priceMap.entrySet()) {
            if (element.getValue() > 150) {
                System.out.println(element.getKey() + " " + element.getValue());
            }
        }
    }
}
