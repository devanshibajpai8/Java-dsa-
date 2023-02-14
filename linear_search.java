public class linear_search {
    public int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("element is present at " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        linear_search l = new linear_search();
        int[] a = { 2, 4, 5, 1, 8 };
        l.search(a, 4);
    }

}
