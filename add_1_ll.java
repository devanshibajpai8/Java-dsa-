public class add_1_ll {
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

    public node add_one() {
        node curr = head;
        node pre = null;
        int carry = 1;
        while (curr != null) {
            curr.data = curr.data + carry;
            carry = (curr.data) / 10;
            curr.data = (curr.data) % 10;
            pre = curr;
            curr = curr.next;
        }
        if (carry != 0) {
            node t = new node(carry);
            pre.next = t;
        }
        return reverse();

    }

    public static void main(String[] args) {
        add_1_ll nod = new add_1_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(9);
        node third = nod.new node(9);
        nod.head.next = second;
        second.next = third;

        nod.display();
        nod.head = nod.reverse();
        nod.head = nod.add_one();
        nod.display();

    }
}
