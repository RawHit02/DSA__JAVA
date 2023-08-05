package DP;

public class EditDistance {

    // Recursion

    // static int edit(String first, String second, int m, int n) {
    // if (m == 0) {
    // return n;
    // }
    // if (n == 0) {
    // return m;
    // }
    // if (first.charAt(m - 1) == second.charAt(n - 1)) {
    // return edit(first, second, m - 1, n - 1);
    // }
    // int insert = edit(first, second, m, n - 1);
    // int delete = edit(first, second, m - 1, n);
    // int replace = edit(first, second, m - 1, n - 1);
    // int min = Math.min(insert, delete);
    // return 1 + Math.min(min, replace);
    // }

    // public static void main(String[] args) {
    // String str1 = "sunday";
    // String str2 = "satuday";
    // int res = edit(str1, str2, str1.length(), str2.length());
    // System.out.println(res);

    //

    // Tabulation DP
    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";
        int m = str1.length();
        int n = str2.length();
        int matrix[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    matrix[i][j] = j;
                } else if (j == 0) {
                    matrix[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1];
                } else {
                    int insert = matrix[i][j - 1];
                    int delete = matrix[i - 1][j];
                    int replace = matrix[i - 1][j - 1];
                    int result = Math.min(insert, delete);
                    matrix[i][j] = 1 + Math.min(result, replace);
                }
            }
        }
        System.out.println(matrix[m][n]);
    }
}
