public class circular_sll {
    node head;
    node last;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public circular_sll() {
        this.head = null;
        this.last = null;

    }

    public void display() {
        node current = last.next;
        while (current != last) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public void insert_start(int data) {
        node a = new node(data);
        if (last == null) {
            last = a;
        } else {
            a.next = last.next;
        }
        last.next = a;
    }

    public static void main(String[] args) {
        circular_sll nod = new circular_sll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        third.next = nod.head;
        nod.last = third;
        nod.insert_start(4);
        nod.display();

    }
}
