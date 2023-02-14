import java.util.Scanner;

public class max_arr {
    void max_ele(int ar[]) {
        int large = ar[1];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > large) {
                large = ar[i];
            }
        }
        System.out.println("max value:" + large);
    }

    public static void main(String[] args) {
        max_arr r = new max_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.max_ele(a);
    }
}
