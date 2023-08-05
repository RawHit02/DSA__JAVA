package Heap;

import java.util.PriorityQueue;

public class MinCostOfRopes {

    static int mincost(int arr[]) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int i : arr) {
            minheap.offer(i);
        }

        int ans = 0;
        while (minheap.size() != 1) {
            int l1 = minheap.poll();
            int l2 = minheap.poll();
            int sumlength = l1 + l2;
            ans += sumlength;
            minheap.offer(sumlength);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        int ans = mincost(arr);
        System.out.println(ans);
    }
}
