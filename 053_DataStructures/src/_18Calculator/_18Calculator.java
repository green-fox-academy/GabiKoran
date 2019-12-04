package _18Calculator;

import java.util.Scanner;

public class _18Calculator {
    public static void main(String... args) {
        calculate(getUserInput());
    }

    public static Input getUserInput() {
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        input.setOperation(scanner.next());
        input.setOperandA(scanner.nextInt());
        input.setOperandB(scanner.nextInt());
        return input;
    }
    
    public static void calculate(Input input) {
            int result;
            if (input.getOperation().equals("+")) {
                result = input.getOperandA() + input.getOperandB();
            } else if (input.getOperation().equals("-")) {
                result = input.getOperandA() - input.getOperandB();
            } else if (input.getOperation().equals("*")) {
                result = input.getOperandA() * input.getOperandB();
            } else if (input.getOperation().equals("/")) {
                result = input.getOperandA() / input.getOperandB();
            } else if (input.getOperation().equals("%")) {
                result = input.getOperandA() % input.getOperandB();
            } else {
                result = -99999999; // I don't know how could I catch this exception
            }
        System.out.println(result);
    }
}