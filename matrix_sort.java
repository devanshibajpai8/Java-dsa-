import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class matrix_sort {

    public void print(int[][] matrix, int r, int c) {
        int temp[] = new int[r * c];
        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[k++] = matrix[i][j];
            }
        }
        Arrays.sort(temp);
        k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = temp[k++];
            }
        }
        System.out.println("sorted matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println("\n");
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
        matrix_sort a = new matrix_sort();
        a.print(matrix, n, m);

    }
}
