package DP;

public class SubsetSumTabulation {
    static boolean isSubSet(int set[], int n, int sum) {
        boolean subset[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            subset[i][0] = true;
        }
        for (int i = 1; i <= sum; i++) {
            subset[0][i] = false;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (set[i - 1] <= j) {
                    subset[i][j] = subset[i - 1][j - set[i - 1]] || subset[i - 1][j];
                } else {
                    subset[i][j] = subset[i - 1][j];
                }
            }
        }
        return subset[n][sum];
    }

    public static void main(String[] args) {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        System.out.println(isSubSet(set, set.length, sum));

    }

}
