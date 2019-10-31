import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 5 integers in a row (separated by space): ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    sc.close();
    //System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    System.out.println("Sum: " + (a+b+c+d+e) + " Average: " + ((a+b+c+d+e)/5));
    }
}