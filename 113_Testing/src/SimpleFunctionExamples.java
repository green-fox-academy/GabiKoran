public class SimpleFunctionExamples {

    public int add(int number1, int number2) {
        if (Integer.MAX_VALUE - number1 < number2) {
            System.err.printf("%d + %d is bigger than Integer max value\n", number1, number2);
            return Integer.MAX_VALUE;
        }
        return number1 + number2;
    }

    public float arrayAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.err.println("empty array");
            return 0;
        }

        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

}