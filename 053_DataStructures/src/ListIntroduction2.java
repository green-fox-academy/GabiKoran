import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[] args) {
//        Create a list ('List A') which contains the following values
//                Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> ListA = new ArrayList<String>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

//        Create a new list ('List B') with the values of List A
        ArrayList<String> ListB = new ArrayList<String>(ListA);

//        Print out whether List A contains Durian or not
        System.out.println("ListA contains Durian? " + ListA.contains("Durian"));
        System.out.println("ListB contains Durian? " + ListB.contains("Durian"));

//        Remove Durian from List B
        ListB.remove("Durian");

//        Add Kiwifruit to List A after the 4th element
        ListA.add(4, "Kiwifruit");
        System.out.println();
        System.out.println("A Kiwifruit indexe: " + ListA.indexOf("Kiwifruit"));
        System.out.println("A Lychee indexe: " + ListA.indexOf("Lychee"));
        System.out.println("The result of \"add Kiwifruit to ListA after the 4th element\": ");
        for (String element : ListA) {
            System.out.println(element);
        }
        System.out.println();

//        Compare the size of List A and List B
        if (ListA.size() > ListB.size()) {
            System.out.println("ListA has more elements");
        } else if (ListA.size() < ListB.size()) {
            System.out.println("ListA has less elements");
        } else {
            System.out.println("ListA and ListB has the same number of elements");
        }

//        Get the index of Avocado from List A
        if (ListA.indexOf("Avocado") < 0) {
            System.out.println("Az Avocado nincs a listában.");
        } else {
            System.out.println("The index of Avocado: " + ListA.indexOf("Avocado"));
        }

//        Get the index of Durian from List B
        if (ListB.indexOf("Durian") < 0) {
            System.out.println("A Durian nincs a listában.");
        } else {
            System.out.println("The index of Duran: " + ListB.indexOf("Durian"));
        }
        System.out.println();
        System.out.println("ListB: ");
        for (String element : ListB) {
            System.out.println(element);
        }
        System.out.println();
//        Add Passion Fruit and Pomelo to List B in a single statement
        ListB.add("Passion Fruit");
        ListB.add("Pomelo");
        System.out.println("hozzáadta-e a Passion Fruitot és a Pomelot: ");
        for (String element : ListB) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println("Ugyanez sorszámokkal: ");
        for (int i = 0; i < ListB.size(); i++) {
            System.out.printf("%d. %s \n", i + 1, ListB.get(i));
        }
//        Print out the 3rd element from List A
        System.out.println();
        System.out.println("The 3rd element from List A: " + ListA.get(4));
    }
}
