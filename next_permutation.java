import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class next_permutation 
{
    public void sortt(int a[]) 
    {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) 
        {
            i--;
        }
        int j = a.length - 1;
        while (j >= 0 && a[j] <= a[i]) 
        {
            j--;
        }
        swap(a, i, j);
        reverse(a, i + 1);
    }

    public void swap(int[] a, int b, int c) {
        int temp;
        temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    public void reverse(int[] a, int s) {
        int end = a.length - 1;
        while (s < end) {
            swap(a, s, end);
            s++;
            end--;
        }
    }

    void display(int ar[]) 
    {
        System.out.println("next permutation is:");
        for (int i = 0; i < ar.length; i++) 
        {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) 
    {
        next_permutation r = new next_permutation();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        r.sortt(a);
        r.display(a);
    }
}