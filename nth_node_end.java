public class nth_node_end {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node end_nod(int n) {
        node ref = head;
        node main = head;
        int count = 0;
        while (count < n) {
            ref = ref.next;
            count++;
        }
        while (ref != null) {
            ref = ref.next;
            main = main.next;
        }
        return main;
    }

    public static void main(String[] args) {
        nth_node_end nod = new nth_node_end();
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

        node n = nod.end_nod(3);
        System.out.println("nth node from end is:" + n.data);

    }
}
