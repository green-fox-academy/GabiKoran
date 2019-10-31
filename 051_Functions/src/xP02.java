public class xP02 {
    public static void main(String[] args) {

        String almapalinka = concatenateWords ("alma", "pálinka");
        System.out.println(almapalinka);
        String haromUjSzo = concatenateWords ("alma", "pálinka", "sör");
        System.out.println(haromUjSzo);
        String sokszo = concatenateWords ("alma", "pálinka", "sör", "1", "65", "eg", "nap");
        System.out.println(sokszo);
    }

    //public static String concatenateWords(String word1, String word2) {
    //    return word1 + word2;
    //}
    //
    ////function overloading (függvény újratöltése):
    //// rendben van, ha ugyanaz a neve több függvénynek is, ha másak a bemeneti paramétereik
    //public static String concatenateWords(String word1, String word2, String word3) {
    //    return word1 + word2 + word3;
    //}


    public static String concatenateWords(String... words) {
        String concatenatedWords = "";
        for (int i = 0; i < words.length; i++) {
            concatenatedWords += words[i];
        }
        return concatenatedWords;
    }
}
