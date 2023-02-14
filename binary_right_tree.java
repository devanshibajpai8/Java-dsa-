import java.util.Stack;
import java.nio.charset.Charset;
import java.util.*;

public class binary_right_tree {
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
        node first = new node(1);
        node second = new node(2);
        node third = new node(3);
        node fourth = new node(5);
        node fifth = new node(4);
        root = first;
        first.left = second;
        first.right = third;
        second.right = fourth;
        third.right = fifth;
    }

    public ArrayList<Integer> right(node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        right(root, res, 0);
        return res;
    }

    public void right(node root, ArrayList<Integer> level, int a) {
        if (root == null) {
            return;
        }
        if (a == level.size()) {
            level.add(root.data);
            System.out.println(root.data);
        }
        right(root.right, level, a + 1);
        right(root.left, level, a + 1);
    }

    public static void main(String[] args) {
        binary_right_tree b = new binary_right_tree();
        b.create();
        b.right(root);
    }

    public void cd() {
    }
}