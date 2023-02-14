import javax.lang.model.util.ElementScanner14;

public class validate_bst {
    static node root;

    class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
        }
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

    public void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "-> ");
        inorder(root.right);
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public static void main(String[] args) {
        validate_bst b = new validate_bst();
        b.insert(5);
        b.insert(2);
        b.insert(1);
        b.insert(3);
        b.insert(21);
        b.insert(19);
        b.insert(9);
        b.insert(17);
        b.insert(25);
    }

}
