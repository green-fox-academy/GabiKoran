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

        int element = 4;
        int[][] matrix = new int[element][];
        for (int i = 0; i < element ; i++) {
            matrix[i] = new int[element];
            for (int j = 0; j < element; j++) {
                if (j == i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        // - Print this two dimensional array to the output

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
