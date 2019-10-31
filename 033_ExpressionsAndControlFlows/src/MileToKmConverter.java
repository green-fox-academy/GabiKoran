import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the distance in miles: ");
        Double miles = scanner.nextDouble();
        Double kilometers = miles*1.609344;
        System.out.println("It's " + Math.round(kilometers*1000)/1000. + " km");
    }
}