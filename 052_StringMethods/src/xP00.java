public class xP00 {
    public static void main(String[] args) {
        String s1 = "    wOrd r    ";
        String s2 = "WoRD";

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());

        System.out.println(s1.endsWith("or"));       // (true or )false
        System.out.println(s2.startsWith("WoR"));   // true( or false)

        System.out.println(s1.equals(s2));              // true or false
        System.out.println(s1.equalsIgnoreCase(s2));    // true or false

        System.out.println(s1.concat(s2));

        //System.out.println(s1.charAt());
        System.out.println(s1.indexOf('r'));
        System.out.println(s1.indexOf('r', 4)); // character és fromindex
        System.out.println(s1.substring(3, 6)); // starting & ending index -cut out
        System.out.println(s1.replace('r', 'l'));
        System.out.println(s1.replace("Or", "il"));
        System.out.println(s1.trim()); // levágja a szünetet
    }
}
