public class rem_loop_ll {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void removeloop(node slow) {
        node temp = head;
        while (slow.next != temp.next) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void detect() {
        node fast = head;
        node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                removeloop(slow);
                return;
            }
        }

    }

    public static void main(String[] args) {
        rem_loop_ll nod = new rem_loop_ll();
        nod.head = nod.new node(2);
        node second = nod.new node(3);
        node third = nod.new node(3);
        node fourth = nod.new node(7);
        node fifth = nod.new node(8);
        node sixth = nod.new node(9);
        nod.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = second;

        nod.detect();
        nod.display();
    }
}
