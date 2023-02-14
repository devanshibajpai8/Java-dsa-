import java.util.Stack;
import java.nio.charset.Charset;
import java.util.*;

public class binary_dia_tree {
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

    int height(node root) {
        if (root == null)
            return 0;
        return (1
                + Math.max(height(root.left),
                        height(root.right)));

    }

    int diameter(node root) {
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));
    }

    public void print(node root, int l) {
        if (root == null) {
            return;
        }
        if (l == 1) {
            System.out.println(root.data);
        } else if (l > 1) {
            print(root.left, l - 1);
            print(root.right, l - 1);
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        binary_dia_tree b = new binary_dia_tree();
        b.create();
        System.out.println("height of the tree:" + b.diameter(root));

    }
}