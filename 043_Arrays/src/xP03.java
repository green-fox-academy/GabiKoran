public class xP03 {
    public static void main(String[] args) {

        System.out.println(concatenateNTimes("he", 2));
        System.out.println(concatenateNTimes("he", 3));
        System.out.println(concatenateNTimes("ha", 5));
        System.out.println(concatenateNTimes("ho"));
        System.out.println(concatenateNTimes("ho", 12));
    }

    // jó példa a function overloadingra:
    // ha pl nem adunk meg számot, akkor 2-szer írja ki, ez legyen az alapértelmezett
    // 2 függvénnyel, de ugyanazzal a függvénynévvel tudjuk meghatározni
    // (de hogy elkerüljük a kódduplikációt, ...
            //public static String concatenateNTimes(String word) {
            //    String concatenatedWord = "";
            //    for (int i = 0; i < 2; i++) {
            //        concatenatedWord += word;
            //    }
            //    return concatenatedWord;
            //}

    public static String concatenateNTimes(String word) {
        return concatenateNTimes(word,2);
    }

    public static String concatenateNTimes(String word, int times) {
        if (times > 10) {
            return "Too much";     // a return miatt itt be is fejezi, ha nagyobb, mint 10
        }
        String concatenatedWord = "";
        for (int i = 0; i < times; i++) {
            concatenatedWord += word;
        }
        return concatenatedWord;
    }
}
