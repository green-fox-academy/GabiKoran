import java.util.HashMap;
import java.util.Map;

public class _02MapIntroduction1 {
    public static void main(String[] args) {
//    Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> practice = new HashMap<>(); // csak nagybetűs lehet
//    Print out whether the map is empty or not
        System.out.println(practice.isEmpty());
//    Add the following key-value pairs to the map
        practice.put(97, 'a');  //97	a
        practice.put(98, 'b');  //98	b
        practice.put(99, 'c');  //99	c
        practice.put(65, 'A');  //65	A
        practice.put(66, 'B');  //66	B
        practice.put(67, 'C');  //67	C
        System.out.println(practice);
//    Print all the keys
        System.out.println(practice.keySet());
//    Print all the values
        System.out.println(practice.values());
//    Add value D with the key 68
        practice.put(68, 'D');
//    Print how many key-value pairs are in the map
        System.out.println(practice.size());
//    Print the value that is associated with key 99
        System.out.println(practice.get(99));
//    Remove the key-value pair where with key 97
        practice.remove(97);
//    Print whether there is an associated value with key 100 or not
        System.out.println((practice.get(100) != null));
//    Remove all the key-value pairs
        practice.clear();
        System.out.println(practice.isEmpty());
    }
}
