import java.util.Scanner;

public class rev_ll_grp {
    node head;

    class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        node new_node = new node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public node reverse(node head, int k) {
        if (head == null) {
            return null;
        }
        node curr = head;
        node pre = null;
        node next = null;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            head.next = reverse(next, k);
        }
        return pre;
    }

    public static void main(String[] args) {
        rev_ll_grp llist = new rev_ll_grp();
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.display();
        llist.head = llist.reverse(llist.head, 3);
        llist.display();

    }
}
