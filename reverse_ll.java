public class reverse_ll {
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

    public node reverse() {
        node curr = head;
        node pre = null;
        node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        reverse_ll nod = new reverse_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;

        nod.display();
        nod.head = nod.reverse();
        nod.display();

    }
}
