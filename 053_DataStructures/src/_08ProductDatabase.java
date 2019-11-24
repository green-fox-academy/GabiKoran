import java.util.*;

public class _08ProductDatabase {
    public static void main(String[] args) {
//        We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
//
//        Create a map with the following key-value pairs.
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Eggs", 200);
        priceMap.put("Milk", 200);
        priceMap.put("Fish", 400);
        priceMap.put("Apples", 150);
        priceMap.put("Bread", 50);
        priceMap.put("Chicken", 550);
//        priceMap.put("checkfor125", 125);
//        priceMap.put("checkfor125_1", 125);

//        Create an application which solves the following problems.
//
//        How much is the fish?
        System.out.println("The fish's price: " + priceMap.get("Fish") + "\n");

//        What is the most expensive product?
        //System.out.println("The most expensive product: " + Collections.max(priceMap.values()) + "\n");
        int mostExpensivePrice = Collections.max(priceMap.values());
        String mostExpensiveProduct = "";
        for (Map.Entry<String, Integer> element : priceMap.entrySet()) {
            if (element.getValue() == mostExpensivePrice) {
                mostExpensiveProduct += element.getKey();
            }
        }
        System.out.println("The most expensive product: " + mostExpensiveProduct + "\n");

//        What is the average price?
        int sum = 0;
        for (Integer prices : priceMap.values()) {
            sum += prices;
        }
        int average = sum / priceMap.size();
        System.out.println("The average price: " + average + "\n");

//        How many products' price is below 300?
        int productsBelow300 = 0;
        for (Integer prices : priceMap.values()) {
            if (prices < 300) {
                productsBelow300 += 1;
            }
        }
        System.out.println("Products amount below 300: " + productsBelow300 + "\n");

//        Is there anything we can buy for exactly 125?
        System.out.println("Is there anything we can buy for exactly 125? ");
        boolean isThereProductFor125 = false;
        ArrayList<String> productsFor125 = new ArrayList<>();
        for (Map.Entry<String, Integer> element : priceMap.entrySet()) {
            // int price = 0;
            // String productFor125 = "";
            if (element.getValue() == 125) {
                isThereProductFor125 = true;
                productsFor125.add(element.getKey());
            }
        }
        if (isThereProductFor125 == true) {
            System.out.println("Yes: ");
            for (int i = 0; i < productsFor125.size(); i++) {
                System.out.println(productsFor125.get(i));
            }
            System.out.println();
        } else {
            System.out.println("No\n");
        }


//        What is the cheapest product?
        int cheapestPrice = Collections.min(priceMap.values());
        String cheapestProduct = "";
        for (Map.Entry<String, Integer> element : priceMap.entrySet()) {
            if (element.getValue() == cheapestPrice) {
                cheapestProduct += element.getKey();
            }
        }
        System.out.println("The cheapest product: " + cheapestProduct + "\n");
    }
}
