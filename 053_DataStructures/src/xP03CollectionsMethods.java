import java.util.ArrayList;
import java.util.Collections;

public class xP03CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();
        szamok.add(5);
        szamok.add(100);
        szamok.add(2);
        
        System.out.println(Collections.max(szamok));
        System.out.println(Collections.min(szamok));
    }
}
