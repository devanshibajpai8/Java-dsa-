public class middle_node_ll {
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

    public node middle() {
        node curr = head;
        node tem = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        int n;
        if (count % 2 != 0) {
            n = count / 2;
        } else {
            n = (count / 2);
        }
        int b = 0;
        while (tem != null && b != n) {
            tem = tem.next;
            b++;
        }
        return tem;
    }

    public static void main(String[] args) {
        middle_node_ll nod = new middle_node_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        node fourth = nod.new node(6);
        node fifth = nod.new node(8);
        node sixth = nod.new node(1);

        nod.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        nod.display();
        nod.head = nod.middle();
        nod.display();

    }
}
