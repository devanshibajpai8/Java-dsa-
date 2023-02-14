import java.util.Scanner;

public class insertion_sort {
    int[] sort(int ar[]) {
        for (int i = 1; i < ar.length; i++) {
            int temp = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > temp) {
                ar[j + 1] = ar[j];
                j = j - 1;
            }
            ar[j + 1] = temp;
        }
        return ar;
    }

    void display(int ar[]) {
        System.out.println("the array is after insertion sort:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        insertion_sort r = new insertion_sort();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.sort(a);
        r.display(a);
    }
}
