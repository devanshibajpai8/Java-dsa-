import javax.lang.model.util.ElementScanner14;

public class binary_search_tree {
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

    public node search(node root, int key) {
        if (root == null || root.data == key) {
            return root;
        } else if (key > root.data) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }

    }

    public static void main(String[] args) {
        binary_search_tree b = new binary_search_tree();
        b.insert(5);
        b.insert(2);
        b.insert(1);
        b.insert(3);
        b.insert(21);
        b.insert(19);
        b.insert(9);
        b.insert(17);
        b.insert(25);
        b.inorder(root);
        if (null != b.search(root, 6)) {
            System.out.println("\nkey is present in the tree");
        } else {
            System.out.println("\nkey is not present in the tree");
        }
    }

}
