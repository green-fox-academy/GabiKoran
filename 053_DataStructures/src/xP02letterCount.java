import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class xP02letterCount {
    public static void main(String[] args) {
        String text = "ennek szeretném megszámolni a betüit";
        String[] letterOfText = text.split("");

        HashMap<String, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < letterOfText.length; i++) {
            String letter = letterOfText[i];
            if (!letterCount.containsKey(letter) ){
                letterCount.put(letter, 1);
            } else {
                letterCount.replace(letter, letterCount.get(letter) + 1);
            }
        }
        System.out.println(letterCount);

        for (String letter : letterCount.keySet()) {
            System.out.print(" " + letter + ",  ");
        }

        System.out.println();
        for (Integer number : letterCount.values()) {
            System.out.print(" " + number + ",  ");
        }

        System.out.println();
        for (Map.Entry<String, Integer> letterC : letterCount.entrySet()) {
            System.out.print(letterC + ", ");
        }
    }
}
