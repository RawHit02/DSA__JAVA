package Heap;

import java.util.PriorityQueue;

public class Factorsgame {
    static int func(int n) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(1);
        for (int i = 1; i < n; i++) {
            int current = minheap.poll();
            while (!minheap.isEmpty() && minheap.peek() == current) {
                current = minheap.poll();
            }
            minheap.add(current * 2);
            minheap.add(current * 3);
            minheap.add(current * 5);
        }
        return minheap.poll();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Answer is " + func(n));
    }

}
