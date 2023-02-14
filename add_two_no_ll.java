public class add_two_no_ll {
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

    public void insert_end(int data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;
            return;
        }
        node curr = head;
        while (null != curr.next) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    public node reverse() {
        node cur = head;
        node pre = null;
        node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

    public node count(node a, node b) {
        node c = new node(0);
        node e = c;
        while (a.next != null && b.next != null) {
            e.data = a.data + b.data;
            e.next = new node(e.data);
            a = a.next;
            b = b.next;
            e = e.next;
        }
        return c;
    }

    public static void main(String[] args) {
        add_two_no_ll nod = new add_two_no_ll();
        nod.insert_end(2);
        nod.insert_end(4);
        nod.insert_end(3);
        nod.head = nod.reverse();
        nod.display();

        add_two_no_ll no = new add_two_no_ll();
        no.insert_end(4);
        no.insert_end(4);
        no.insert_end(1);
        no.head = no.reverse();
        no.display();

        add_two_no_ll re = new add_two_no_ll();
        re.head = re.count(nod.head, no.head);
        re.display();
    }
}
