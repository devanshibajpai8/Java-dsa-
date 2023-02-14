import java.util.LinkedList;

public class graph_adj_list {

    static LinkedList<Integer>[] adjmatrix;
    int V, E;

    public graph_adj_list(int nodes) {
        V = nodes;
        E = 0;
        adjmatrix = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            adjmatrix[i] = new LinkedList<>();
        }
    }

    public void addedge(int x, int y) {
        adjmatrix[x].add(y);
        adjmatrix[y].add(x);
        E++;

    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + "vertices" + E + "edges");
        for (int i = 0; i < 4; i++) {
            s.append(i + " ");
        }
        return null;

    }

    public static void main(String[] args) {
        graph_adj_matrix g = new graph_adj_matrix(4);
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(2, 3);
        g.addedge(3, 0);
        g.display(null);
    }
}
