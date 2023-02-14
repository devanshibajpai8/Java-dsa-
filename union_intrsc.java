import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class union_intrsc {
    void inters(int a[], int b[]) {
        System.out.println("Intersectiong element:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }

            }
        }
    }

    void union(int a[], int b[]) {

    }

    public static void main(String[] args) {
        union_intrsc r = new union_intrsc();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int m;
        System.out.print("enter the value of m:");
        m = s.nextInt();
        int b[] = new int[m];
        System.out.println("enter the elements:");
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        r.inters(a, b);
        r.union(a, b);

    }
}
