import java.util.Scanner;

public class majority_ele {
    public void find(int a[]) {
        int n = a.length;
        int size = n / 2;
        int s = -1;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > size) {
                s = a[i];
            }
        }
        if (s != -1) {
            System.out.println("majority element is:" + s);
        } else {
            System.out.println("-1");
        }

    }

    public static void main(String[] args) {
        majority_ele r = new majority_ele();
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
