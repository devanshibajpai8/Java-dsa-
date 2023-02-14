
public class insert_end_ll {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert_end(int data) {
        node temp = new node(data);
        if (head == null) {
            temp = head;
            return;
        }
        node curr = head;
        while (null != curr.next) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    public static void main(String[] args) {
        insert_end_ll nod = new insert_end_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        nod.insert_end(9);
        nod.display();

    }
}
