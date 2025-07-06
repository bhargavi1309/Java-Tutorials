import java.util.*;

class MinHeap {
    List<Integer> heap = new ArrayList<>();

    void insert(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        while (i > 0 && heap.get(i) < heap.get((i - 1) / 2)) {
            Collections.swap(heap, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    int extractMin() {
        if (heap.isEmpty()) throw new NoSuchElementException();
        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }
        return min;
    }

    void heapify(int i) {
        int smallest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;
        if (smallest != i) {
            Collections.swap(heap, i, smallest);
            heapify(smallest);
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();
        h.insert(10); h.insert(5); h.insert(20);
        System.out.println(h.extractMin());
    }
}