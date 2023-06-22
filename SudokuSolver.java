public class SudokuSolver {
    static final int MAX_SIZE = 9;
    char[][] board = {
        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    public boolean solver(int row, int col) {
        // if we reach last col, move to the next row
        if (col == MAX_SIZE) {
            return solver(row + 1, 0);
        }

        // if we reach last row, all cells are filled up, sudoku solved
        // Termination case
        if (row == MAX_SIZE) {
            return true;
        }

        // if cell is not empty, move to the next column
        if (board[row][col] != '.') {
            return solver(row, col + 1);
        }

        // if a cell is empty, try filling it with digits from 1 to 9
        // and check if it's safe to place a digit
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(row, col, num)) {
                board[row][col] = num;
                print();
                System.out.println("===============");
                boolean result = solver(row, col + 1);
                if (result) {
                    return true;
                }
                // Backtracking: undo the current placement
                board[row][col] = '.';
            }
        }

        return false;
    }

    private boolean isPresentInRow(int row, char value) {
        for (int col = 0; col < MAX_SIZE; col++) {
            if (board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInCol(int col, char value) {
        for (int row = 0; row < MAX_SIZE; row++) {
            if (board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInGrid(int row, int col, char value) {
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col, char value) {
        return !isPresentInRow(row, value) && !isPresentInCol(col, value) && !isPresentInGrid(row, col, value);
    }

    void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
                if (j != board.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SudokuSolver obj = new SudokuSolver();
        obj.solver(0, 0);
    }
}
