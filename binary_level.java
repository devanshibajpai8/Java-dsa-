import java.util.Stack;
import java.nio.charset.Charset;
import java.util.*;

public class binary_level {
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

    public void order(node root) {
        int h = height(root);
        int i;
        System.out.println("height of tree is:" + h);

        for (i = h; i >= 1; i--) {
            print(root, i);

        }
    }

    int height(node root) {
        int h = 0;
        int d = 0;
        if (root == null) {
            return 0;
        } else {
            int lh = height(root.left);
            int rh = height(root.right);

            if (lh > rh) {
                h = lh + 1;
                return (lh + 1);
            } else {
                h = rh + 1;
                return (rh + 1);
            }
        }

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
        binary_level b = new binary_level();
        b.create();
        b.order(root);
        System.out.println("\n");

    }
}