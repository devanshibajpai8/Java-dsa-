public class ssor {
    int ssor(int a[], int l, int h) {

        int i = l;
        int j = l;
        int pivot = a[h];
        int temp;
        while (i <= h) {
            if (a[i] <= pivot) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    int[] sorrrt(int a[], int l, int h) {
        if (l < h) {
            int p = ssor(a, l, h);
            ssor(a, l, p - 1);
            ssor(a, p + 1, h);
        }
        return a;
    }

    void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

    public static void main(String args[]) {
        ssor n = new ssor();
        int a[] = { 3, 6, 2, 1, 8, 9, 10, 4 };
        int l = a[0];
        int h = a[a.length - 1];
        n.ssor(a, l, h);
        n.sorrrt(a, l, h);
        n.display(a);
    }
}