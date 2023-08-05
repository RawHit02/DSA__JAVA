package Stack;

import java.util.Stack;

public class NextGreaterCircular {
    // static int[] func2(int[] prices) {
    // int n = prices.length;
    // int ans[] = new int[n];
    // Stack<Integer> stack = new Stack<>();
    // for (int i = 2 * n - 1; i >= 0; i--) {
    // while (!stack.isEmpty() && prices[stack.peek()] <= prices[i % n]) {
    // stack.pop();
    // }
    // ans[i % n] = stack.isEmpty() ? -1 : prices[stack.peek()];
    // stack.push(i % n);
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // int prices[] = { 70, 95, 55, 30, 85, 90 };
    // int[] ans = func2(prices);
    // for (int i : ans) {
    // System.out.print(i + " ");
    // }
    // }

    public static int[] func2(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (s.isEmpty() == false && s.peek() <= prices[i % n]) {
                s.pop();
            }
            if (i < n) {
                if (s.isEmpty() == false) {
                    ans[i] = s.peek();
                } else {
                    ans[i] = -1;
                }
            }
            s.push(prices[i % n]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int prices[] = { 5, 7, 1, 2, 6, 0 };
        int[] ans = func2(prices);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}