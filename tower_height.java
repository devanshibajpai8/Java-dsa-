import java.util.Scanner;

public class tower_height {
    int[] height(int a[]) {
        System.out.println("enter the value of k:");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < k) {
                a[i] = a[i] + k;
            } else {
                a[i] = a[i] - k;
            }
        }
        return a;
    }

    int max_ele(int ar[]) {
        int large = ar[1];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > large) {
                large = ar[i];
            }
        }
        return large;
    }

    int min_ele(int ar[]) {
        int small = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < small) {
                small = ar[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        tower_height r = new tower_height();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.height(a);
        int v, u;
        v = r.max_ele(a);
        u = r.min_ele(a);
        int sub = v - u;
        System.out.println("the difference is:" + sub);

    }
}
