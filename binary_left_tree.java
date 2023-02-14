import java.nio.charset.Charset;
import java.util.*;

public class binary_left_tree {
    static node root;
    int length;

    class node {
        int data;
        node left;
        node right;
        int length = 0;

        node(int data) {
            this.data = data;
        }
    }

    public void create() {
        node first = new node(2);
        node second = new node(5);
        node third = new node(8);
        node fourth = new node(4);
        node fifth = new node(9);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public List<Integer> right(node root) {
        List<Integer> res = new ArrayList<Integer>();
        left(root, res, 0);
        return res;
    }

    public void left(node root, List<Integer> level, int a) {
        if (root == null) {
            return;
        }
        if (a == level.size()) {
            level.add(root.data);
            System.out.println(root.data);
        }
        left(root.left, level, a + 1);
        left(root.right, level, a + 1);
    }

    public static void main(String[] args) {
        binary_left_tree b = new binary_left_tree();
        b.create();
        b.right(root);

    }
}