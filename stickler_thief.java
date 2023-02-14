import java.util.Scanner;

public class stickler_thief {
    public void find(int a[]) {
        int sum = 0, r = 0;
        for (int i = 1; i < a.length; i++) {
            sum = sum + a[i++];
        }

        for (int i = 0; i < a.length; i++) {
            r = r + a[i++];
        }
        if (sum > r) {
            System.out.println(sum);
        } else {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        stickler_thief r = new stickler_thief();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.find(a);

    }

}
