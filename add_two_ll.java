public class add_two_ll {
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

    public void inter(node nod, node nodd) {
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 
        // creating first list
        list.head1 = new node(7);
        list.head1.next = new node(5);
        list.head1.next.next = new node(9);
        list.head1.next.next.next = new node(4);
        list.head1.next.next.next.next = new node(6);
        System.out.print("First list is ");
        list.printList(head1);
 
        // creating second list
        list.head2 = new node(8);
        list.head2.next = new node(4);
        System.out.print("Second list is ");
        list.printList(head2);
 
        System.out.print("Resultant list is ");
        // add the two lists and see the result
        list.addTwoLists(head1, head2);
        

    }
}
