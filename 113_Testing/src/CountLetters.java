import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> countLetters(String inputText) {
        HashMap<Character, Integer> lettersAndTheirQuantity = new HashMap<>();
        char[] inputTextArray = inputText.toCharArray();
        for (int i = 0; i < inputTextArray.length; i++) {
            char letter = inputTextArray[i];
            if (!lettersAndTheirQuantity.containsKey(letter)) {
                lettersAndTheirQuantity.put(letter, 1);
            } else {
                lettersAndTheirQuantity.replace(letter, (lettersAndTheirQuantity.get(letter) + 1));
            }
        }
        return lettersAndTheirQuantity;
    }
}
