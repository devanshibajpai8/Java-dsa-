public class find_mid_node {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node mid_node() {
        node fast = head;
        node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        find_mid_node nod = new find_mid_node();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        node fourth = nod.new node(7);
        nod.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        node midn = nod.mid_node();
        System.out.println(midn.data);

    }
}