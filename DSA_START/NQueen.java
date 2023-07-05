public class NQueen {
    
    static int countWays(boolean[][] board, int currentRow, int N) {
        int count = 0;
        // Base case: if all queens are placed, return 1
        if (currentRow == N) {
            return 1;
        }

        // Traverse all columns of the board
        for (int col = 0; col < N; col++) {
            // Check if the queen is safe to place
            if (isSafe(board, currentRow, col, N)) {
                // Place the queen on the board
                board[currentRow][col] = true;
                // Move to the next row once a queen is placed in the current row
                count += countWays(board, currentRow + 1, N);
                // Backtrack: remove the queen from the current position
                board[currentRow][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col, int N) {
        // Check if there is a queen in the same column and above row
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // Check in the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // Check in the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 4; // Number of queens and size of the board
        boolean[][] board = new boolean[N][N];
        int count = countWays(board, 0, N);
        System.out.println(count);
    }
}
