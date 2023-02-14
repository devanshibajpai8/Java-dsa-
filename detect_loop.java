
public class detect_loop {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean detect() {
        node fast = head;
        node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        detect_loop nod = new detect_loop();
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
        sixth.next = third;
        System.out.println("Is loop present:");
        System.out.println(nod.detect());

    }
}
