class intersection_point_ll {
    Node a = null;
    Node b = null;
    static Node dummy = null;
    static Node tail = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data) {
        Node temp = new Node(data);
        if (dummy == null) {
            dummy = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    void sortedIntersect() {

        Node p = a, q = b;
        while (p != null && q != null) {
            if (p.data == q.data) {
                System.out.println(p.data);
                break;
            } else if (p.data < q.data)
                p = p.next;
            else
                q = q.next;
        }
    }

    // Driver code
    public static void main(String args[]) {
        intersection_point_ll list = new intersection_point_ll();

        list.a = new Node(3);
        list.a.next = new Node(6);
        list.a.next.next = new Node(9);
        list.a.next.next.next = new Node(15);
        list.a.next.next.next.next = new Node(30);

        list.b = new Node(2);
        list.b.next = new Node(4);
        list.b.next.next = new Node(15);
        list.b.next.next.next = new Node(30);

        list.sortedIntersect();
    }
}