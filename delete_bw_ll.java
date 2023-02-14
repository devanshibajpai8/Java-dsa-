public class delete_bw_ll {
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

    public void delete_btw(int pos) {

        int count = 1;
        if (pos == 1) {
            head = head.next;

        } else {
            node pre = head;
            while (count < pos - 1) {
                pre = pre.next;
                count++;
            }
            node curr = pre.next;
            pre.next = curr.next;

        }
    }

    public static void main(String[] args) {
        delete_bw_ll nod = new delete_bw_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        nod.delete_btw(3);
        nod.display();

    }
}
