import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class matrix_max_1 {

    public void print(int[][] matrix, int r, int c) {
        int larg = 0;
        int l = 0;
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > larg) {
                larg = count;
                l = i;
            }

        }
        System.out.println("max no. of 1's:" + larg + "\nat row:" + l);

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
        matrix_max_1 a = new matrix_max_1();
        a.print(matrix, n, m);

    }
}
