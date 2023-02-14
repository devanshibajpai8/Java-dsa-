import java.util.Scanner;

public class given_diff {
    public int find(int a[], int d) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] - a[j] == d) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        given_diff r = new given_diff();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("enter the difference:");
        int q = s.nextInt();
        int w = r.find(a, q);
        System.out.println(w);
    }

}
