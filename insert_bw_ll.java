
public class insert_bw_ll {
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

    public void insert_btw(int data, int pos) {
        node temp = new node(data);
        int count = 1;
        if (pos == 1) {
            temp.next = head;
            head = temp;
        } else {
            node pre = head;
            while (count < pos - 1) {
                pre = pre.next;
                count++;
            }
            node curr = pre.next;
            temp.next = curr;
            pre.next = temp;
        }
    }

    public static void main(String[] args) {
        insert_bw_ll nod = new insert_bw_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        nod.insert_btw(9, 4);
        nod.display();

    }
}
