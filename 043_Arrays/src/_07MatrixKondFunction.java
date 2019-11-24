import java.util.Arrays;

public class _07MatrixKondFunction {

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

        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            for (int columnIndex = 0; columnIndex < size; columnIndex++) {
                if (rowIndex == columnIndex) {
                    matrix[rowIndex][columnIndex] = 1;
                }
            }
        }

        return matrix;
    }

}