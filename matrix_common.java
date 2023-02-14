import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class matrix_common {

    public void print(int[][] matrix, int r, int c) {
        for (int j = 0; j < c; j++) {
            int x = matrix[0][j], count = 0;

            for (int i = 1; i < r; i++) {
                for (int k = 0; k < c; k++) {
                    if (x == matrix[i][k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count == r - 1)
                System.out.print("common element is:" + x);

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
        matrix_common a = new matrix_common();
        a.print(matrix, n, m);

    }
}
