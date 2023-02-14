public class delete_first_cll {
    node head;
    node last;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public delete_first_cll() {
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

    public node delete_first() {
        node a = head;
        if (last.next == last) {
            last = null;
        } else {
            last.next = a.next;
        }
        head.next = head;
        a.next = null;
        return a;

    }

    public static void main(String[] args) {
        delete_first_cll nod = new delete_first_cll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        third.next = nod.head;
        nod.last = third;
        nod.delete_first();
        nod.display();

    }
}
