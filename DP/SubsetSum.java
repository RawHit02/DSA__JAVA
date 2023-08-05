package DP;

public class SubsetSum {
    // Recursiove Solution
    static boolean subset(int arr[], int sum, int n) {
        if (n < 0 || sum < 0) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        return subset(arr, sum - arr[n], n - 1) || subset(arr, sum, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };
        int sum = 9;
        int n = arr.length - 1;
        boolean res = subset(arr, sum, n);
        System.out.println(res);
    }

    // DP solution

}
