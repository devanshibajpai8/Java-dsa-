import java.util.Scanner;

public class rev_arr {
    void reverse(int[] ar) {
        System.out.println("the reversed array is:");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }

    void display(int ar[]) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        rev_arr r = new rev_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.display(a);
        r.reverse(a);
    }
}
