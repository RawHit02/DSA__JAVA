public class pattern5 {
    static int currentNumber = 1;

    static void printPattern(int rows) {
        if (rows == 0) {
            return;
        }

        printPattern(rows - 1);
        printNumbersForRow(rows);
        System.out.println();
    }

    static void printNumbersForRow(int row) {
        if (row == 0) {
            return;
        }

        printNumbersForRow(row - 1);
        System.out.print(currentNumber + " ");
        currentNumber++;
    }

    public static void main(String[] args) {
        int numRows = 4;
        printPattern(numRows);
    }
}
