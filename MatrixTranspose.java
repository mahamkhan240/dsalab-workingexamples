import java.util.Scanner;

public class MatrixTranspose {

    // Method to compute the transpose of the matrix
    public static void transposeMatrix(int[][] matrix, int rows, int cols) {
        // Create a new matrix for the transpose
        int[][] transpose = new int[cols][rows];

        // Loop through the matrix and transpose the elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];  // Swap rows and columns
            }
        }

        // Printing the transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for matrix dimensions
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        // Create the matrix
        int[][] matrix = new int[rows][cols];

        // Input elements for the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calling method to find the transpose
        transposeMatrix(matrix, rows, cols);

        sc.close();
    }
}
