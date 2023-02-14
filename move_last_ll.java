
public class move_last_ll {
    node head;

    class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        node new_node = new node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public node reverse(node head) {
        node curr = head;
        node pre = null;
        while (curr.next != null) {
            pre = curr;
            curr = curr.next;
        }
        pre.next = null;
        curr.next = head;
        head = curr;
        return head;
    }

    public static void main(String[] args) {
        move_last_ll llist = new move_last_ll();
        llist.push(21);
        llist.push(2);
        llist.push(4);
        llist.push(6);
        llist.push(5);
        llist.push(7);
        llist.push(3);
        llist.push(8);
        llist.push(1);
        llist.display();
        llist.head = llist.reverse(llist.head);
        llist.display();

    }
}
