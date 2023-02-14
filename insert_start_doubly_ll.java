public class insert_start_doubly_ll {
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

    public insert_start_doubly_ll() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void display_forward() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void display_backward() {
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.pre;
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

    public void insert_start(int data) {
        node a = new node(data);
        if (head == null) {
            tail = a;
        } else {
            head.pre = a;
        }
        a.next = head;
        head = a;
        length++;
    }

    public static void main(String[] args) {
        insert_start_doubly_ll nod = new insert_start_doubly_ll();
        nod.insert_end(2);
        nod.insert_end(4);
        nod.insert_end(5);
        nod.insert_end(7);
        nod.insert_end(9);
        nod.insert_start(1);
        nod.insert_end(8);
        nod.display_forward();
        nod.display_backward();
        System.out.println("length of the linklist is:" + nod.length);
    }
}
