public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        System.out.println(quote);
        String quote1 = quote.substring(0, (quote.indexOf(':') + 5)) + "always takes longer than" + quote.substring(quote.indexOf(':') + 4);
        System.out.println(quote1);
        String quote2 = quote.substring(0, quote.indexOf("you")) + "always takes longer than" + quote.substring(quote.indexOf(" you"));
        System.out.println(quote2);
        System.out.printf("%s always takes longer than %s", quote.substring(0, quote.indexOf(" you")), quote.substring(quote.indexOf("you")));
    }
}