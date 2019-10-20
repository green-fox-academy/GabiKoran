public class Cica {
    public static void main(String[] args) {
        int firstNumber = 1;
        float doubleNumber = 1.5f;
        int secondNumber;
        secondNumber = 3;
        boolean isHungry = true;
        String name = "Furkesz";
        char letter = 'a';

        int thirdNumber = firstNumber + secondNumber;

        System.out.println(thirdNumber);
        System.out.println(secondNumber + firstNumber);
        thirdNumber++;
        System.out.println(thirdNumber);
        thirdNumber = thirdNumber + 5;
        System.out.println(thirdNumber);
        thirdNumber += 5;
        System.out.println(thirdNumber);
        System.out.println();


        if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else if (thirdNumber < 15) {
            System.out.println("third number is lower than 15");
        } else {
            System.out.println("third number is bigger than 15");
        }
    }
}
