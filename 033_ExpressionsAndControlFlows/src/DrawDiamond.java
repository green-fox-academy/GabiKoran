import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        int height = getUserInput();  // get the height of the diamond from the user
        drawDiamond(height);  // draw the diamond with the given height

    }

    private static void drawDiamond(int height) {
        int halfHeight = (height + 1) / 2;  // calculate the half of the diamond height rounded up
        drawPyramid(halfHeight);  // draw the top half (pyramid) of the diamond

        if ((height & 1) == 0) {  // if height is an even number
            drawMiddleLine(height); // draw 1 extra line to the middle of the diamond
        }

        drawInversePyramid(halfHeight - 1); // draw the second half of the diamond (inverse pyramid)
    }

    private static void drawMiddleLine(int height) {
        drawAsterixes(height - 1);
        System.out.println();
    }

    private static int getUserInput() { // get the height of the diamond from the console
        System.out.print("Height of the diamond: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void drawInversePyramid(int pyramidHeight) {
        for (int i = 0; i < pyramidHeight; i++) {
            drawSpaces(i + 1);  // draw 1 more space in each line starting from 1
            drawAsterixes(2 * pyramidHeight - 1 - 2 * i); // draw 2 less asterixes in each line starting from 2 * height - 1
            System.out.println(); // end of the line
        }
    }

    private static void drawPyramid(int pyramidHeight) {
        for (int i = 0; i < pyramidHeight; i++) {
            drawSpaces(pyramidHeight - i - 1);  // draw 1 less space in each line starting from height - 1
            drawAsterixes(2 * i + 1); // draw 2 more asterixes in each line starting from 1
            System.out.println(); // end of line
        }
    }

    private static void drawAsterixes(int limit) {  // print limit number of asterixes next to each other
        for (int j = 0; j < limit; j++) {
            System.out.print("*");
        }
    }

    private static void drawSpaces(int limit) { // print limit number of spaces next to each other
        for (int j = 0; j < limit; j++) {
            System.out.print(" ");
        }
    }

}