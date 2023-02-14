import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class kth_max_min {
    void min(int ar[]) {
        System.out.println("enter the k value:");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        Arrays.sort(ar);
        System.out.println(+ar[k - 1]);

    }

    void max(int ar[], int n) {
        System.out.println("enter the k value:");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        Arrays.sort(ar);
        System.out.println(+ar[n - k]);

    }

    public static void main(String[] args) {
        kth_max_min r = new kth_max_min();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.min(a);
        r.max(a, n);
    }
}
