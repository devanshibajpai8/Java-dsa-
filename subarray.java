import java.util.Scanner;

public class subarray {
    void sub(int a[]) {
        int c = 0;
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            c = c + a[i];
            if (b < c) {
                b = c;
            }
        }
        System.out.println("largest sum:" + b);
    }

    public static void main(String[] args) {
        subarray r = new subarray();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.sub(a);

    }
}
