import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        /* //version1: manual
        int[][] matrix = new int[4][];
        matrix[0] = new int[]{1, 0, 0, 0};
        matrix[1] = new int[]{0, 1, 0, 0};
        matrix[2] = new int[]{0, 0, 1, 0};
        matrix[3] = new int[]{0, 0, 0, 1};
        //System.out.println(matrix[2][3]);
        */
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
            matrix[index][index] = 1;       // elég csak ezeket 1-re változtatni, mert a többi alapból 0, az az integerek default értéke
        }

        return matrix;
    }

}
