package Heap;

import java.util.PriorityQueue;

public class MinDiffrence {

    static int minDiff(int[] arr) {

        if (arr.length == 1) {
            return 1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : arr) {
            minHeap.offer(i);
        }
        int min = Integer.MAX_VALUE;
        int top = minHeap.poll();
        while (!minHeap.isEmpty()) {
            int current = minHeap.poll();
            int diff = current - top;
            min = Math.min(min, diff);
            top = current;
        }
        return min;
    }

    public static void main(String[] args) {
        // int arr[] = { 4, 10, 23, 25, 9 };
        int arr[] = { 4 };
        System.out.println("Answer is " + minDiff(arr));
    }

}
