import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
//        Represent the following products with their prices
        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("Milk", 1.07);
        priceList.put("Rice", 1.59);
        priceList.put("Eggs", 3.14);
        priceList.put("Cheese", 12.60);
        priceList.put("Chicken Breasts", 9.40);
        priceList.put("Apples", 2.31);
        priceList.put("Tomato", 2.58);
        priceList.put("Potato", 1.75);
        priceList.put("Onion", 1.10);

//        Represent Bob's shopping list
        HashMap<String, Integer> bobsList = new HashMap<>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

//        Represent Alice's shopping list
        HashMap<String, Integer> alicesList = new HashMap<>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breast", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

//        How much does Bob pay?
        double sumBob = 0;
        for (Map.Entry<String, Integer> element : bobsList.entrySet()) {
            sumBob += priceList.get(element.getKey()) * element.getValue();
        }
        System.out.println(sumBob + "\n");

//        How much does Alice pay?
        double sumAlice = 0;
        for (Map.Entry<String, Integer> elementA : alicesList.entrySet()) {
           sumAlice += priceList.get(elementA.getKey()) * elementA.getValue(); // itt még vm gigszi van!!!!!
        }
        System.out.println(sumAlice + "\n");

//        Who buys more Rice?
        System.out.println("Who buys more Rice?");
        if (bobsList.get("Rice") > alicesList.get("Rice")) {
            System.out.println("Bob.\n");
        } else if (bobsList.get("Rice") < alicesList.get("Rice")) {
            System.out.println("Alice.\n");
        } else {
            System.out.println("They buy the same amount of rice.\n");
        }

//        Who buys more Potato?
        System.out.println("Who buys more Potato?");
        int alicePotato = 0;
        if (alicesList.get("Potato") != null) {
            alicePotato = alicesList.get("Potato");
        }
        int bobPotato = 0;
        if (bobsList.get("Potato") != null) {
            bobPotato = bobsList.get("Potato");
        }
        if (bobPotato > alicePotato) {
            System.out.println("Bob.\n");
        } else if (bobPotato < alicePotato) {
            System.out.println("Alice.\n");
        } else {
            System.out.println("They buy the same amount of potato.\n");
        }

//        Who buys more different products?
        if (bobsList.size() > alicesList.size()) {
            System.out.println("Bob buys more different products.\n");
        } else if (bobsList.size() < alicesList.size()) {
            System.out.println("Alice buys more different products.\n");
        } else {
            System.out.println("They buy the same number of different products.\n");
        }

//        Who buys more products? (piece)
        System.out.println("Who buys more products?");
        int bobNumberOfProducts = 0;
        for (Map.Entry<String, Integer> element : bobsList.entrySet()) {
            bobNumberOfProducts += element.getValue();
        }
        int aliceNumberOfProducts = 0;
        for (Map.Entry<String, Integer> element : alicesList.entrySet()) {
            aliceNumberOfProducts += element.getValue();
        }
        if (bobNumberOfProducts > aliceNumberOfProducts) {
            System.out.println("Bob.\n");
        } else if (bobNumberOfProducts < aliceNumberOfProducts) {
            System.out.println("Alice.\n");
        } else {
            System.out.println("They buy the same number of products.\n");
        }
    }

}
