import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class rotate_arr {
    int[] sortt(int a[]) {
        int x = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;
        return a;
    }

    void display(int ar[]) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        rotate_arr r = new rotate_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.sortt(a);
        r.display(a);
    }
}
