import java.util.Scanner;

public class quick_sort {
    int sort(int ar[], int low, int high) {
        int i = low;
        int j = low;
        int pivot;
        pivot = ar[high];
        while (i <= high) {
            if (ar[i] <= pivot) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    int[] sorrt(int a[], int low, int high) {
        if (low < high) {
            int p = sort(a, low, high);
            sorrt(a, low, p - 1);
            sorrt(a, p + 1, high);
        }
        return a;
    }

    void display(int ar[]) {
        System.out.println("the array is after insertion sort:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        quick_sort r = new quick_sort();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int l = a[0], h = a[n - 1];
        r.sort(a, l, h);
        r.sorrt(a, l, h);
        r.display(a);
    }
}
