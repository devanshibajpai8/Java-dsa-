
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class matrix_pair {

    public void print(int[][] matrix, int r, int c) {
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                for (int u = i + 1; u < r; u++) {
                    for (int v = j + 1; v < c; v++) {
                        if (larg < (matrix[u][v] - matrix[i][j])) {
                            larg = matrix[u][v] - matrix[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(larg);

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
        matrix_pair a = new matrix_pair();
        a.print(matrix, n, m);

    }
}
