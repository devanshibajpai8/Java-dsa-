
public class rem_key_ll {
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

    public void rem_key(int data) {
        node temp = null;
        node curr = head;
        while (curr != null && curr.data != data) {
            temp = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return;
        } else {
            temp.next = curr.next;
        }
    }

    public static void main(String[] args) {
        rem_key_ll nod = new rem_key_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        third.next = null;
        nod.rem_key(3);
        nod.display();

    }
}
