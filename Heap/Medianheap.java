package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Medianheap {

    static double findmedian(int arr[]) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (maxheap.isEmpty() || arr[i] <= maxheap.peek()) {
                maxheap.offer(arr[i]);
            } else {
                minheap.offer(arr[i]);
            }
            // check for size
            if (minheap.size() > maxheap.size()) {
                maxheap.offer(minheap.poll());
            } else if (maxheap.size() > minheap.size() + 1) {
                minheap.offer(maxheap.poll());
            }
        }
        if (maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek()) / 2.0;
        } else {
            return maxheap.poll();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(findmedian(arr));
    }

}
