
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class index {
    public void search(int a[], int n) {
        for(int i=0;i<a.length;i++)
        {
            
            
        }

    }

    public static void main(String[] args) {
        index r = new index();
        Scanner s = new Scanner(System.in);
        int n, l;
        System.out.print("enter the value of n:");
        n = s.nextInt();

        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        r.search(a, n);
    }
}
