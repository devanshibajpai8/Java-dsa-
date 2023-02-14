import java.util.Scanner;

public class reve_arr {
    static int[] reverse(int ar[]) {
        int[] arr = new int[ar.length];
        for (int i = ar.length - 1; i >= 0; i--) {
            arr[i] = ar[i];
        }
        return arr;
    }

    void display(int ar[]) {
        System.out.println("the array is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        reve_arr r = new reve_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.display(a);
        r.reverse(a);
        r.display(a);
    }
}
