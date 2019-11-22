public class _07Strings {
    public static void main(String[] args) {
        //Given a string,
        // compute recursively (no loops) a new string where
        // all the lowercase 'x' chars have been changed to 'y' chars.
        String test = "x1234567x890x";
//        System.out.println(test.substring(1));        // String.methods tesztek
//        System.out.println(test.charAt(0));           // String.methods tesztek
//        System.out.println(test.equals("x"));         // String.methods tesztek
//        System.out.println(test.charAt(0) == 'x');    // String.methods tesztek
        System.out.println(replaceXToY(test));
    }

    public static String replaceXToY(String text) {
        int n = text.length();
        if (text.length() == 0) {
            return "";
        } if (text.charAt(0) == 'x') {
            return 'y' + replaceXToY(text.substring(1));
        } else
        return text.charAt(0) + replaceXToY(text.substring(1));
    }
}