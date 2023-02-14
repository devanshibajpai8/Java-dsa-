
public class insert_node_sorted {
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

    public node insert_node(int data) {
        node newnode = new node(data);
        node temp = null;
        node curr = head;
        while (curr != null && curr.data < newnode.data) {
            temp = curr;
            curr = curr.next;
        }
        newnode.next = curr;
        temp.next = newnode;
        return head;
    }

    public static void main(String[] args) {
        insert_node_sorted nod = new insert_node_sorted();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(5);
        nod.head.next = second;
        second.next = third;
        nod.insert_node(4);
        nod.display();

    }
}
