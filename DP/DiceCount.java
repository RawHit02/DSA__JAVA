package DP;

public class DiceCount {
    // Recursion
    static int countWays(int currentValue, int endValue) {
        if (currentValue == endValue) {
            return 1;
        }
        if (currentValue > endValue) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count = count + countWays(currentValue + dice, endValue);
        }
        return count;
    }

    // Memoization
    static int countWays1(int currentValue, int endValue, int cache[]) {
        if (currentValue == endValue) {
            return 1;
        }
        if (currentValue > endValue) {
            return 0;
        }
        if (cache[currentValue] != 0) {
            return cache[currentValue];
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count = count + countWays(currentValue + dice, endValue);
        }
        cache[currentValue] = count;
        return count;
    }

    // Tabulation
    static int countWays1(int start, int end) {
        int cache[] = new int[end + 1];
        cache[end] = 1;
        for (int i = end - 1; i >= 0; i--) {
            int count = 0;
            for (int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                // do sum of last 6 values;
                count = count + cache[dice + i];
            }
            cache[i] = count;
        }
        return cache[start];
    }

    public static void main(String[] args) {
        int target = 10;
        int cache[] = new int[target + 1];

        int output = countWays(0, target);
        int output1 = countWays1(0, target, cache);
        int output2 = countWays1(0, target);

        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
    }
}
