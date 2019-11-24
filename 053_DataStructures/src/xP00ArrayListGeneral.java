import java.util.ArrayList;

public class xP00ArrayListGeneral {
    public static void main(String[] args) {
        ArrayList<String> teszt = new ArrayList<>();
        ArrayList<String> apples = new ArrayList<>();
        teszt.add("0");
        teszt.add("1");
        teszt.add("3");
        apples.add("piros");
        apples.add("zold");
        apples.add("sarga");
        System.out.println(teszt);
        System.out.println(apples);
        teszt.addAll(apples);
        System.out.println(teszt);
        System.out.println(apples);
        teszt.removeAll(apples);
        System.out.println(teszt);
        System.out.println(apples);
        teszt.clear();
        System.out.println(teszt);
        System.out.println(apples);
        System.out.println(apples.toString());

    }
}
