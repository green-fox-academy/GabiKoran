public class xP04 {
    public static void main(String[] args) {

        printNTimes("ha", 130000);
    }
/*
    // alt + enter
    // break - for ciklust állítja le
    private static void printNTimes(String word, int times) {
        int printLimit = 5;
        for (int i = 0; i < times; i++) {
            if (i < printLimit) {
                System.out.println(word);
            } else {
                break;  // a for ciklust leállítja, ne számoljon feleslegesen
            }           // mert ha ez nem lenne, a for ciklus még pörögne
                        // 5 után kár lenne még 129995-ször végigpörgetnie
        }
    }

    // return - egész functionból lép ki (kivételes eset - void és return)
    private static void printNTimes(String word, int times) {
        int printLimit = 5;
        for (int i = 0; i < times; i++) {
            if (i < printLimit) {
                System.out.println(word);
            } else {
                return;  // itt kilép, megszakítja az egész function-t
            }           // de még csak a printed all-t se írja ki
        }               // ez kivételes eset, hogy void és return van benne
        System.out.println("Printed all");
    }
*/
    // return - szebben
    private static void printNTimes(String word, int times) {
        int printLimit = 5;
        for (int i = 0; i < times; i++) {
            if (i == printLimit) {
                return;
            }
            System.out.println(word);
        }
        System.out.println("Printed all");
    }
}
