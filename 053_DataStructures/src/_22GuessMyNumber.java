import java.util.Scanner;

public class _22GuessMyNumber {
    public static void main(String[] args) {
        int lives = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give the range. Enter the smallest and the highest possible number.");
        int rangeSmalestNumber = scanner.nextInt();
        int rangeHighestNumber = scanner.nextInt();

        int searchedNumber = (int)(Math.random() * (rangeHighestNumber - rangeSmalestNumber + 1)) + rangeSmalestNumber;

        System.out.println("Please, guess a number betwwen " + rangeSmalestNumber + " and " + rangeHighestNumber);
        System.out.println(searchedNumber);
        int givenNumber = scanner.nextInt();;
        while (searchedNumber != givenNumber && lives > 0) {
            lives -= 1;
            if (lives > 0) {
                if (searchedNumber > givenNumber) {
                    System.out.println("Too low. You have " + lives + " left.");
                    givenNumber = scanner.nextInt();
                } else if (searchedNumber < givenNumber) {
                    System.out.println("Too high. You have " + lives + " left.");
                    givenNumber = scanner.nextInt();
                }
            } else if (lives == 0) {
                System.out.println("Game Over");
            }
        }
        if (searchedNumber == givenNumber) {
            System.out.println("Congratulations. You won!");
        }
    }
}
