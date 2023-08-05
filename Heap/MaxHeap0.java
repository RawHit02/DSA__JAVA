package Heap;

public class MaxHeap0 {
    public int[] heap;
    public int size;
    public int capacity;

    public MaxHeap0(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public int leftchild(int index) {
        return 2 * index + 1;
    }

    public int rightchild(int index) {
        return 2 * index + 2;
    }

    public void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void insert(int x) {
        // overflow
        if (size == capacity) {
            System.out.println("full");
            return;
        }
        int current = size;
        heap[size++] = x;
        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);

        }
    }

    public int delete() {
        // underflow
        if (size == 0) {
            System.out.println("Empty");

        }
        int x = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return x;
    }

    public void maxHeapify(int index) {
        int parent = index;
        int left = leftchild(index);
        int right = rightchild(index);

        if (left < size && heap[left] > heap[parent(0)]) {
            parent = left;
        }
        if (right < size && heap[right] > heap[parent]) {
            parent = right;
        }
        if (parent != index) {
            swap(index, parent);
            maxHeapify(parent);
        }
    }

    public static void main(String[] args) {

        MaxHeap0 maxheap = new MaxHeap0(10);
        maxheap.insert(4);
        maxheap.insert(8);
        maxheap.insert(13);

        System.out.println(maxheap.delete());
        System.out.println(maxheap.delete());
    }
}
