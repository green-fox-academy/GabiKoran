public class _01Doubling {
    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        int baseNum = 123;
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`
        System.out.println(doubling(baseNum));
    }

    public static int doubling(int base) {
        int doubled = base * 2;
        return doubled;
    }
}