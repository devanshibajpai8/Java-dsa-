public class insert_end_cll {
    node head;
    node last;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public insert_end_cll() {
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

    public void insert_end(int data) {
        node a = new node(data);
        if (last == null) {
            last = a;
            last.next = last;
        } else {
            a.next = last.next;
            last.next = a;
            last = a;
        }
    }

    public static void main(String[] args) {
        insert_end_cll nod = new insert_end_cll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        third.next = nod.head;
        nod.last = third;
        nod.insert_end(4);
        nod.display();

    }
}
