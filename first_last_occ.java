
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class first_last_occ {
    public void search(int a[], int n, int l) {
        int w = 0;
        int lar = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == l) {
                System.out.println("least index:" + i);
                break;
            }

        }
        for (int i = 0; i < n; i++) {
            if (a[i] == l) {
                w = i;
            }
            if (w > lar) {
                lar = w;
            }
        }
        System.out.println("largest index:" + lar);

    }

    public static void main(String[] args) {
        first_last_occ r = new first_last_occ();
        Scanner s = new Scanner(System.in);
        int n, l;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        System.out.print("enter the value to be found:");
        l = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.search(a, n, l);
    }
}
