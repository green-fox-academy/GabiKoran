import java.util.Scanner;

public class _18Calculator {
    public static void main(String... args) {
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        int operandA = scanner.nextInt();
        int operandB = scanner.nextInt();

        System.out.println(calculate(operation, operandA, operandB));
    }

    // sima string a kimenet a getUserInputnál
    public static int calculate(String operation, int operandA, int operandB) { // classban 3 field a bemenet
        int result;
        if (operation.equals("+")) {
            result = operandA + operandB;
        } else if (operation.equals("-")) {
            result = operandA - operandB;
        } else if (operation.equals("*")) {
            result = operandA * operandB;
        } else if (operation.equals("/")) {
            result = operandA / operandB;
        } else if (operation.equals("%")) {
            result = operandA % operandB;
        } else {
            result = -9999999;
        }
        return result;
    }
}