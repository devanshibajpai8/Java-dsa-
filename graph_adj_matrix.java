public class graph_adj_matrix {

    static int[][] adjmatrix;
    int v, e;

    public graph_adj_matrix(int nodes) {
        v = nodes;
        e = 0;
        adjmatrix = new int[nodes][nodes];
    }

    public void addedge(int x, int y) {
        adjmatrix[x][y] = 1;
        adjmatrix[y][x] = 1;
        e++;
    }

    public void display(int[][] adjmatrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(adjmatrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        graph_adj_matrix g = new graph_adj_matrix(4);
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(2, 3);
        g.addedge(3, 0);
        g.display(adjmatrix);
    }
}