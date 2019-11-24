import java.util.Arrays;

public class _07MatrixKondFunctionWithOneForLoop {

    public static void main(String[] args) {
        int size = 4;
        int[][] matrix = createMatrix(size);
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix) {
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
                System.out.print(matrix[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int index = 0; index < size; index++) {
            matrix[index][index] = 1;
        }

        return matrix;
    }

}