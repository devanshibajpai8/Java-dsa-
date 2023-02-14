import java.util.Scanner;

public class resize_arr {
    void resize(int a[]) {
        int t = 0;
        t = a.length + 1;
        int sum = t * (t + 1) / 2;
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
        }
        System.out.println("missing:" + sum);

    }

    public static void main(String[] args) {
        resize_arr r = new resize_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.resize(a);
    }
}
