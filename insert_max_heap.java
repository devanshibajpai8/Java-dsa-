public class insert_max_heap {
    int[] heap;
    int n;

    public insert_max_heap(int cap) {
        heap = new int[cap + 1];
        n = 0;
    }

    public boolean isempty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int val) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = val;
        heapify(n);
    }

    public void resize(int cap) {
        int[] temp = new int[cap];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void heapify(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }

    }

    public void print() {
        for (int i = 1; i <= n; i++) {
            System.out.println(heap[i] + " ");
        }
    }

    public static void main(String args[]) {
        insert_max_heap a = new insert_max_heap(4);
        a.insert(4);
        a.insert(5);
        a.insert(2);
        a.insert(6);
        a.insert(1);
        a.insert(3);
        System.out.println(a.size());
        a.print();
    }
}
