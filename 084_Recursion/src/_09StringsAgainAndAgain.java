public class _09StringsAgainAndAgain {
    public static void main(String[] args) {
        //Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
        String text = "01234567890";
        System.out.println(separate(text));
    }
    public static String separate(String text) {
        int n = text.length();
        if (text.length() == 1) {
            return text;
        }
            return text.charAt(0) + "*" + separate(text.substring(1));
    }
}
