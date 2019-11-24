import java.util.HashMap;

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

    }
}
