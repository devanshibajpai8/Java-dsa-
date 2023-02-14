import java.util.Scanner;

public class min_arr {
    void min_ele(int ar[]) {
        int small = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < small) {
                small = ar[i];
            }
        }
        System.out.println("min value:" + small);
    }

    public static void main(String[] args) {
        min_arr r = new min_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.min_ele(a);
    }
}
