import java.util.Scanner;

public class _18Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        int operandA = scanner.nextInt();
        int operandB = scanner.nextInt();

        calculate(operation, operandA, operandB);
    }

    public static void calculate(String operation, int operandA, int operandB) {
        if (operation.equals("+")) {
            System.out.println(operandA + operandB);
        } else if (operation.equals("-")) {
            System.out.println(operandA - operandB);
        } else if (operation.equals("*")) {
            System.out.println(operandA * operandB);
        } else if (operation.equals("/")) {
            System.out.println(operandA / operandB);
        } else if (operation.equals("%")) {
            System.out.println(operandA % operandB);
        } else {
            System.out.println("Sorry, it's invalid input.");
        }
    }
}