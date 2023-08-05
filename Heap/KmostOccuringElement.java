package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;

public class KmostOccuringElement {

    static void mostOccuring(int arr[], int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i : arr) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            System.out.println(maxHeap.poll().getKey());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4 };
        int k = 2;
        mostOccuring(arr, k);
    }

}
