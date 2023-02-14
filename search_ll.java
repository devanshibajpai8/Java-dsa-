public class search_ll {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void search(int data) {
        node curr = head;
        int count = 1;
        while (curr.data != data) {
            curr = curr.next;
            count++;
        }
        System.out.println("element is present at position " + count);
    }

    public static void main(String[] args) {
        search_ll nod = new search_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        nod.search(5);

    }
}
