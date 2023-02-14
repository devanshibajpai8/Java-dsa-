import javax.lang.model.util.ElementScanner14;

public class search_matr {

    public void print(int[][] matrix, int r, int c, int key) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("item found at " + i + " " + j);
                }
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
        search_matr s = new search_matr();
        s.print(matrix, 4, 4, 17);

    }
}
