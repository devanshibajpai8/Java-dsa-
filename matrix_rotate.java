
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class matrix_rotate {

    public void print(int[][] matrix, int r, int c) {
        System.out.println("matrix rotated at 90degree:");
        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");

            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of matrix(n*m):");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("enter the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        matrix_rotate a = new matrix_rotate();
        a.print(matrix, n, m);

    }
}
