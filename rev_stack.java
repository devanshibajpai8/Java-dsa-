import java.util.Stack;
import java.nio.charset.Charset;
import java.util.*;

public class rev_stack {
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

    public void display(String str) {
        System.out.println("\nafter reversing the string:" + str);
    }

    public String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.print("enter the string:");
        rev_stack ss = new rev_stack();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String v = ss.reverse(str);
        ss.display(v);

    }
}