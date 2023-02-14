public class rem_duplicate {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void dup() {
        node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

    }

    public node dup_un() {
        node temp = head;
        node r = head;
        while (temp != null) {
            r = temp;
            while (r.next != null) {
                if (temp.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
                temp = temp.next;
            }

        }
        return head;
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        rem_duplicate nod = new rem_duplicate();
        nod.head = nod.new node(2);
        node second = nod.new node(8);
        node third = nod.new node(5);
        node fourth = nod.new node(5);
        node fifth = nod.new node(7);
        node sixth = nod.new node(9);
        nod.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        nod.display();
        nod.dup_un();
        nod.display();

    }
}
