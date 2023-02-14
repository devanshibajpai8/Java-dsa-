import java.util.*;

public class bst_validate {
    static node root;

    class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public node insert(node root, int data) {
        if (root == null) {
            root = new node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean validate(node root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = validate(root.left, min, root.data);
        if (left) {
            boolean right = validate(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        bst_validate b = new bst_validate();
        b.insert(5);
        b.insert(2);
        b.insert(1);
        b.insert(2);
        b.insert(21);
        b.insert(19);
        b.insert(9);
        b.insert(17);
        b.insert(25);
        boolean f = b.validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (f) {
            System.out.println("The tree is valid");
        } else {
            System.out.println("The tree is invalid");
        }
    }

}
