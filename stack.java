public class stack {
    node top;
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

    public void push(int data) {
        node temp = new node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        int res = top.data;
        top = top.next;
        length--;
        return res;
    }

    public void display() {
        node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(7);
        s.push(1);
        int d = s.pop();
        System.out.println("element poped:" + d);
        s.display();

    }

    public void greater(int[] ar) {
    }
}