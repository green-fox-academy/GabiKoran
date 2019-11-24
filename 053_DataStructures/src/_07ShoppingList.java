import java.util.ArrayList;

public class _07ShoppingList {
    public static void main(String[] args) {
//        We are going to represent a shopping list in a list containing strings.

//                Create a list with the following items.
//        Eggs, milk, fish, apples, bread and chicken
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

//        Create an application which solves the following problems.
//        Do we have milk on the list?
        System.out.println("Do we have milk on the list? ");
        if (shoppingList.contains("milk") == true) {
            System.out.println("Yes, we have.\n");
        } else {
            System.out.println("No, we don't.\n");
        }

//                Do we have bananas on the list?
        System.out.println("Do we have bananas on the list? ");
        if (shoppingList.contains("bananas") == true) {
            System.out.println("Yes, we have.\n");
        } else {
            System.out.println("No, we don't.\n");
        }
    }
}
