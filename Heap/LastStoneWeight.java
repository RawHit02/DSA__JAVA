package Heap;

import java.util.PriorityQueue;

public class LastStoneWeight {

    static int laststoneweight(int[] arr) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> b - a);
        for (int i : arr) {
            maxheap.offer(i);
        }
        while (maxheap.size() != 1) {
            int weight1 = maxheap.poll();
            int weight2 = maxheap.poll();
            int diffrence = weight1 - weight2;
            maxheap.add(diffrence);
        }
        return maxheap.poll();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 6, 7, 1, 2 };
        System.out.println("Answer isv " + laststoneweight(arr));
    }

}
