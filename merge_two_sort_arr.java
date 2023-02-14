import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class merge_two_sort_arr {

    int[] merge(int a[], int b[]) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }

    void display(int[] ar) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        merge_two_sort_arr r = new merge_two_sort_arr();
        Scanner s = new Scanner(System.in);
        int n, m;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("enter the value of n:");
        m = s.nextInt();
        int b[] = new int[m];
        System.out.println("enter the elements of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        int[] result = r.merge(a, b);
        r.display(result);
    }

}
