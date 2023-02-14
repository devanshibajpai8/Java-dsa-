import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class soort {
    void sortt(int a[], int n, int m) {
        if (n < m) {
            int q = (n + m) / 2;
            sortt(a, n, q);
            sortt(a, q + 1, m);
            merge(a, n, q, m);
        }

    }

    void merge(int a[], int n, int q, int m) {
        int n1 = q - n + 1;
        int n2 = m - q;
        int l[] = new int[n1];
        int r[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            l[i] = a[n + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = a[q + i + 1];
        }
        int i = 0, j = 0;
        int k = n;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = r[j];
            j++;
            k++;
        }

    }

    void display(int ar[]) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        soort r = new soort();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.sortt(a, 0, n - 1);
        r.display(a);
    }
}
