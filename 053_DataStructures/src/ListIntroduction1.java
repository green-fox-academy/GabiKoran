import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
//        Create an empty list which will contain names (strings)
        ArrayList<String> name = new ArrayList<String>();
//                Print out the number of elements in the list
        System.out.println(name);
//        Add William to the list
        name.add("William");
//        Print out whether the list is empty or not
        System.out.println(name.isEmpty());
//        Add John to the list
        name.add("John");
//        Add Amanda to the list
        name.add("Amanda");
//        Print out the number of elements in the list
        System.out.println(name.size());
//        Print out the 3rd element
        System.out.println(name.get(2));
//        Iterate through the list and print out each name
//                William
//                John
//                Amanda
        for (String element : name) {
            System.out.println(element);
        }
//      Iterate through the list and print
//        1. William
//        2. John
//        3. Amanda
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%d. %s\n", (i + 1), name.get(i));
        }
//        Remove the 2nd element
        name.remove(1);
        for (String element : name) {
            System.out.println(element);
        }
//        Iterate through the list in a reversed order and print out each name
//                Amanda
//                William
        //System.out.println(name.get(1));
        //System.out.println(name.get(0));
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(name.size()-1-i));
        }
//        Remove all elements
        name.removeAll(name);
        for (String element : name) {
            System.out.println(element);
        }
        System.out.println(name.isEmpty());
    }
}
