public class rem {
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

    void rem(node s) {
        node temp = head;
        while (temp.next != s.next) {
            temp = temp.next;
            s = s.next;
        }
        s.next = null;
    }

    void detect() {
        node f = head;
        node s = head;
        while (f.next != null && s.next != null && f != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                rem(s);
                return;
            }
        }

    }

    public static void main(String[] args) {
        rem nod = new rem();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        node fourth = nod.new node(7);
        node fifth = nod.new node(8);
        node sixth = nod.new node(9);
        nod.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = second;

        nod.detect();
        nod.display();
    }
}
