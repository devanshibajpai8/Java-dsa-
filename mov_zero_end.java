import java.util.Scanner;

public class mov_zero_end {
    void mov_zero(int a[]) {
        int j = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0 && a[j] == 0) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            if (a[j] != 0) {
                j++;
            }
        }
        System.out.println("array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        mov_zero_end r = new mov_zero_end();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.mov_zero(a);
    }
}
