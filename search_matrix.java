import javax.lang.model.util.ElementScanner14;

public class search_matrix {

    public void search(int[][] matrix, int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i <= n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.println("x found at " + i + " " + j);
                return;
            }
            if (matrix[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("value not found");

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 5, 7, 8 },
                { 12, 14, 17, 18 },
                { 23, 24, 26, 28 },
                { 34, 45, 56, 78 }
        };
        search_matrix s = new search_matrix();
        s.search(matrix, matrix.length, 56);
    }
}
