import java.util.Stack;
import java.nio.charset.Charset;
import java.util.*;

public class binary_tree {
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

    public void preorder(node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + "->");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(node root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(root.data + "->");
            inorder(root.right);
        }
    }

    public void postorder(node root) {
        if (root == null) {
            return;
        } else {
            postorder(root.left);

            postorder(root.right);
            System.out.print(root.data + "->");
        }
    }

    public boolean isEmpty() {
        return length == 0;

    }

    public void preorder_iter(node root) {
        Stack<node> stack = new Stack<>();
        if (root == null) {
            return;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            node temp = stack.pop();
            System.out.print(temp.data + "->");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        System.out.print("null");
    }

    public void inorder_iter(node root) {
        Stack<node> stack = new Stack<>();
        node temp = root;
        if (root == null) {
            return;
        }
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + "->");
                temp = temp.right;
            }

        }
    }

    public void postorder_iter(node root) {
        Stack<node> stack = new Stack<>();
        node temp = root;
        if (root == null) {
            return;
        }
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {

            }
        }
    }

    public static void main(String[] args) {
        binary_tree b = new binary_tree();
        b.create();
        b.preorder(root);
        System.out.println("\n");
        b.preorder_iter(root);
        System.out.println("\n");
        b.inorder_iter(root);
        System.out.println("\n");
        b.inorder(root);
        System.out.println("\n");
        b.postorder(root);
    }
}