import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class matrix_kthsmall {

    public void print(int[][] matrix, int r, int c, int u) {
        int temp[] = new int[r * c];
        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[k++] = matrix[i][j];
            }
        }
        Arrays.sort(temp);
        int res = temp[u - 1];
        System.out.println("so the value at kth index is:" + res);

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
        System.out.println("enter the value of k:");
        int u = s.nextInt();
        matrix_kthsmall a = new matrix_kthsmall();
        a.print(matrix, n, m, u);

    }
}
