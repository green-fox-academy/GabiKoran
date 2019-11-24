import java.util.Arrays;

public class _07MatrixKond {
    public static void main(String[] args) {
        int size = 4;
        //int[][] matrix = new int[size][]; //kis tömböket még nem hoztam létre, ezért null-okkkal van feltöltve
        int[][] matrix = new int[size][size]; //így már 0-ákkal van feltöltve
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
                matrix[rowIndex][columnIndex] = rowIndex; // mi van, ha ez columnIndex
                System.out.print(matrix[rowIndex][columnIndex]);
            }
            System.out.println();
        }
    }
}
