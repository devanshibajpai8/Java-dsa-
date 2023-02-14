import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {
    void sort(int[] a, int[] temp, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            sort(a, temp, l, mid);
            sort(a, temp, mid + 1, h);
            merge(a, temp, l, mid, h);
        }
    }

    void merge(int arr[], int temp[], int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }

    }

    void display(int[] ar) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        merge_sort r = new merge_sort();
        Scanner s = new Scanner(System.in);
        int n, m;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int[] b = new int[a.length];
        r.sort(a, b, 0, a.length - 1);
        r.display(a);

    }

}
