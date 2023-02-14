import javax.lang.model.util.ElementScanner14;

public class binary_search {
    public int binary(int[] a, int key) {
        int l = 0, h = a.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) {
                System.out.println("Element is present at " + mid);
                return mid;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binary_search l = new binary_search();
        int[] a = { 2, 4, 5, 1, 8 };
        l.binary(a, 4);
    }

}
