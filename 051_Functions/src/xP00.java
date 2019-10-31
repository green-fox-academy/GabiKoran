public class xP00 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 4, 5};
        int[] numbers2 = {3, 4, 76, 1, 3};
            //függvényhívás
        int sum1 = sumArray(numbers);   // numbers tömbbel használd a sumArray funkciót
        int sum2 = sumArray(numbers2);  // numbers2 tömbbel használd a sumArray funkciót

        System.out.println(sum1);
        System.out.println(sum2);

        }

            //függvény definíciója -- (integer típusú tömböt vár bemenetnek, inputnak)
    public static int sumArray(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        return sum; // adja vissza azt az eredményt, amit kiszámolt
    }

}