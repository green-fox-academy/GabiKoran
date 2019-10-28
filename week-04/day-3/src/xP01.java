public class xP01 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 4, 5};
        int[] numbers2 = {3, 4, 76, 1, 3};
        //függvényhívás
        int sum1 = sumArray(numbers);   // numbers tömbbel használd a sumArray funkciót
        int sum2 = sumArray(numbers2);  // numbers2 tömbbel használd a sumArray funkciót

        System.out.println(sum1);
        System.out.println(sum2);

        printArraySum(numbers);
        printArraySum(numbers2);

    }
    // void: NINCS return, NEM vár visszatérést, csak pl kikprinteli
    // ezért nem tudom visszatölteni/betölteni egy változóba
    public static void printArraySum(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        System.out.println("The sum of array is: " + sum); // ugyanazt csinálja, mint alább, csak nem visszaadja az értéket, hanem kiprinteli
    }

    //függvény definíciója -- (integer típusú tömböt vár bemenetnek, inputnak)
    public static int sumArray(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        return sum; // adja vissza azt az eredményt, amit kiszámolt -> be tudom tölteni egy változóba
    }

}