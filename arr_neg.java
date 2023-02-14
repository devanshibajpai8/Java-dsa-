import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr_neg {
    int[] sortt(int a[]) {
        Arrays.sort(a);
        return a;
    }

    void display(int ar[]) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        sort r = new sort();
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
