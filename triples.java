import java.util.Scanner;

public class triples {
    public void find(int a[], int n, int d) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                for (int j = i + 2; j < n; j++) {
                    if (a[i] + a[j] + a[k] == d) {
                        count++;
                    }

                }
            }
        }
        System.out.println("output:" + count);
    }

    public static void main(String[] args) {
        triples r = new triples();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("enter the sum:");
        int q = s.nextInt();
        r.find(a, n, q);
    }

}
