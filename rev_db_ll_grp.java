public class rev_db_ll_grp {
    node head;
    node tail;
    int length;

    class node {
        int data;
        node next;
        node pre;

        node(int data) {
            this.data = data;
        }
    }

    public void display_forward() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int length() {
        return length;
    }

    public void insert_end(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        n.pre = tail;
        tail = n;
        length++;
    }

    public node reverse(node head, int k) {
        node prev = null;
        node curr = head;
        node nex = null;

        int count = 0;
        while (count < k && curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            count++;
        }
        if (nex != null) {
            head.next = reverse(nex, k);
        }
        return prev;

    }

    public static void main(String[] args) {
        rev_db_ll_grp nod = new rev_db_ll_grp();
        nod.insert_end(2);
        nod.insert_end(4);
        nod.insert_end(5);
        nod.insert_end(7);
        nod.insert_end(9);
        nod.insert_end(1);
        nod.insert_end(8);
        nod.display_forward();
        nod.head = nod.reverse(nod.head, 2);
        nod.display_forward();

    }
}
