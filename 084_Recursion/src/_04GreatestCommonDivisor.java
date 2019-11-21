public class _04GreatestCommonDivisor {
    public static void main(String[] args) {
        // Find the greatest common divisor of two numbers using recursion.
        System.out.println(GreatCommonDivisor(84, 60));
    }

    public static int GreatCommonDivisor(int a, int b){
        if (b == 0) {
           return a;
        }
        return GreatCommonDivisor(b, a % b);
    }

    // lkt(84, 60);
    // lkt(60, 24);
    // lkt(24, 12);
    // lkt(12, 0); -> 12

    // lkt(60, 84);
    // lkt(84, 60);
    // lkt(60, 24);
    // lkt(24, 12);
    // lkt(12, 0); -> 12
}
