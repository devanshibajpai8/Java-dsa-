
public class merge_two_sort_list {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert_end(int data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;
            return;
        }
        node curr = head;
        while (null != curr.next) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public node merge(node a, node b) {
        node temp = new node(0);
        node tail = temp;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = b;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        merge_two_sort_list nod = new merge_two_sort_list();
        nod.insert_end(4);
        nod.insert_end(6);
        nod.insert_end(8);

        merge_two_sort_list no = new merge_two_sort_list();
        no.insert_end(5);
        no.insert_end(7);
        no.insert_end(9);

        nod.display();
        no.display();

        merge_two_sort_list result = new merge_two_sort_list();
        result.head = result.merge(nod.head, no.head);

        result.display();
    }
}
