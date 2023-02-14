import javax.lang.model.util.ElementScanner14;

public class target_sort {
    public int sort(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= key) {
                return i;
            }
        }
        return a.length;
    }

    public static void main(String[] args) {
        int a[] = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
        target_sort s = new target_sort();
        int p = s.sort(a, 66);
        System.out.println(p);
    }
}
