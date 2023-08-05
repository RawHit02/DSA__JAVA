package DP;

public class FibSeries {
    // Memonization Method

    static int fib(int n, int[] cache) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        int first = fib(n - 1, cache);
        int second = fib(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return result;
    }

    // Tabulatiion Method
    static int fib0(int n, int[] cache) {
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int cache[] = new int[n + 1];
        int result = fib(n, cache);
        int result1 = fib(n, cache);
        System.out.println(result);
        System.out.println(result1);
    }
}
