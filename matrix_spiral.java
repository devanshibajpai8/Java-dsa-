import javax.lang.model.util.ElementScanner14;

public class matrix_spiral {

    public void print(int[][] matrix, int r, int c) {
        int i, k = 0, l = 0;
        while (k < r && l < c) {
            for (i = l; i < c; i++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < r; i++) {
                System.out.print(matrix[i][c - 1] + " ");
            }
            c--;
            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    System.out.print(matrix[r - 1][i] + " ");
                }
                r--;
            }
            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;

            }

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 5, 7, 8 },
                { 12, 14, 17, 18 },
                { 23, 24, 26, 28 },
                { 34, 45, 56, 78 }
        };
        matrix_spiral s = new matrix_spiral();
        System.out.println("Matrix in spiral form:");
        s.print(matrix, 4, 4);

    }
}
