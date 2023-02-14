public class word_wrap {

    public void func(int a[], int k) {
        int cost = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int size = k - 1 - a[i];
            int sum = k - a[i];
            while (size >= 0) {
                size = size - a[i + 1] - 1;
                if (size < 0) {
                    break;
                }
                sum = sum - a[i] - 1;
                i++;
            }
            cost = cost + (sum * sum);
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 2 };
        int k = 4;
        word_wrap r = new word_wrap();
        r.func(a, k);
    }

}
