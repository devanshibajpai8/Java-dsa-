
public class insert_start_ll {
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

    public void insert_start(int data) {
        node temp = new node(data);
        temp.next = head;
        head = temp;
        temp.data = data;
    }

    public static void main(String[] args) {
        insert_start_ll nod = new insert_start_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        third.next = null;
        nod.insert_start(9);
        nod.display();

    }
}
