import java.util.Stack;
import javax.lang.model.util.ElementScanner14;
import java.nio.charset.Charset;
import java.util.*;

public class binary_same_tree {
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
        node third = new node(7);
        root = first;
        first.left = second;
        first.right = third;
    }

    public void cd() {
        node first = new node(1);
        node second = new node(5);
        node third = new node(3);
        root = first;
        first.left = second;
        first.right = third;
    }

    public boolean same(node p, node q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.data != q.data) {
            return false;
        }
        return same(p.left, q.left) && same(p.right, q.right);
    }

    public static void main(String[] args) {
        binary_same_tree b = new binary_same_tree();
        binary_same_tree c = new binary_same_tree();
        binary_same_tree d = new binary_same_tree();
        b.create();
        c.cd();
        System.out.println(d.same(b.root, c.root));

    }
}