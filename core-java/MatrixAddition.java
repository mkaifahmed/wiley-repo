public class MatrixAddition {
    static void printMatrix(int arr[][],
            int rows,
            int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

    static int[][] add(int A[][], int B[][],
            int rows, int cols) {
        int i, j;
        int C[][] = new int[rows][cols];

        for (i = 0; i < rows; i++)
            for (j = 0; j < cols; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    // Driver code
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;

        int A[][] = { { 1, 2 },
                { 3, 4 } };
        // Print the matrices A
        System.out.println("\nMatrix A:");
        printMatrix(A, rows, cols);

        int B[][] = { { 1, 1 },
                { 2, 2 } };

        System.out.println("\nMatrix B:");
        printMatrix(B, rows, cols);

        int C[][] = add(A, B, rows, cols);

        System.out.println("\nResultant Matrix:");
        printMatrix(C, rows, cols);
    }

}
