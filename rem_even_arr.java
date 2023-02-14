import java.util.Scanner;

public class rem_even_arr {
    void remove(int[] ar) {
        System.out.println("after removing even integers the array is:");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                System.out.println(ar[i]);
            }
        }
    }

    public static void main(String[] args) {
        rem_even_arr r = new rem_even_arr();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.remove(a);
    }

}
