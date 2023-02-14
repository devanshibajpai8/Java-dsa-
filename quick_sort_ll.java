
import java.util.Scanner;

public class quick_sort_ll {
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

    public node partition(node start, node end) {
        if (start == end || start == null || end == null) {
            return start;
        }
        node pivot = start;
        node curr = start;
        int pivo = end.data;

        while (start != end) {
            if (start.data < pivo) {
                pivot = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }
        int temp = curr.data;
        curr.data = pivo;
        end.data = temp;

        return pivot;
    }

    void sort(node start, node end) {
        if (start == null || start == end || start == end.next) {
            return;
        }
        node pivot = partition(start, end);
        sort(start, pivot);

        if (pivot != null && pivot == start) {
            sort(pivot.next, end);
        } else if (pivot != null && pivot.next != null) {
            sort(pivot.next.next, end);
        }
    }

    public static void main(String[] args) {
        quick_sort_ll llist = new quick_sort_ll();
        llist.push(3);
        llist.push(4);
        llist.push(7);
        llist.push(1);
        llist.push(5);
        llist.push(8);
        llist.push(9);
        llist.push(2);
        llist.push(6);

        node n = llist.head;
        while (n.next != null)
            n = n.next;
        llist.display();
        llist.sort(llist.head, n);
        llist.display();

    }
}
