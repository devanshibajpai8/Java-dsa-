import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

    int[] merge(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    void display(int[] ar) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        selection_sort r = new selection_sort();
        Scanner s = new Scanner(System.in);
        int n, m;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.merge(a);
        r.display(a);

    }

}
