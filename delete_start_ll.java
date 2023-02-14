public class delete_start_ll {
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

    public node delete_start() {
        if (head == null) {
            return null;
        }
        node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        delete_start_ll nod = new delete_start_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        third.next = null;
        nod.display();
        nod.delete_start();
        System.out.println("after deletion from start:");
        nod.display();

    }
}
