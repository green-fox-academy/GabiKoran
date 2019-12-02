import java.util.*;

public class _17QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    public static String quoteSwap(ArrayList<String> listName) {
        String quote = "";
        String temp3to6 = listName.get(2);
        listName.set(2, listName.get(5));
        listName.set(5, temp3to6);
        for (int i = 0; i < listName.size(); i++) {
            quote += listName.get(i) + " ";
        }
        return quote;
    }
}