public class queue {
    node front;
    node rear;
    int length;

    class node {
        int data;
        node next;
        int length = 0;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        node temp = new node(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue() {
        int res = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return res;
    }

    public void display() {
        node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        queue s = new queue();
        s.enqueue(2);
        s.enqueue(4);
        s.enqueue(5);
        s.enqueue(7);
        s.enqueue(1);
        s.display();
        s.dequeue();
        s.display();

    }
}