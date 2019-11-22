public class _08StringsAgain {
    public static void main(String[] args) {
        //Given a string, compute recursively a new string where all the 'x' chars have been removed.
        String text = "0x123x456x789x0";
        System.out.println(removeX(text));
    }
    public static String removeX(String text) {
        int n = text.length();
        if (text.length() == 0) {
            return "";
        } if (text.charAt(0) == 'x') {
            return removeX(text.substring(1));
        } else
            return text.charAt(0) + removeX(text.substring(1));
    }
}
