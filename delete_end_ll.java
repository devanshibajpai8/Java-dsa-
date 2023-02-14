
public class delete_end_ll {
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

    public node delete_end() {
        node temp = head;
        node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;

    }

    public static void main(String[] args) {
        delete_end_ll nod = new delete_end_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        nod.display();
        nod.delete_end();
        nod.display();

    }
}
