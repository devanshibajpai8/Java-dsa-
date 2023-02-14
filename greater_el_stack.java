import java.util.Stack;

public class greater_el_stack {
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

    public boolean isEmpty() {
        return length == 0;

    }

    public int length() {
        return length;
    }

    public int peek() {
        return top.data;

    }

    public int pop() {
        int res = top.data;
        top = top.next;
        length--;
        return res;
    }

    public void display(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }

    public int[] greater(int ar[]) {
        int res[] = new int[ar.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = ar.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= ar[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(ar[i]);

        }
        return res;

    }

    public static void main(String[] args) {
        greater_el_stack s = new greater_el_stack();
        int ar[] = { 4, 7, 3, 4, 8, 1 };
        int a[] = s.greater(ar);
        s.display(a);

    }
}