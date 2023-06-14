import java.util.ArrayList;

public class mazePathDiagonal {
    static ArrayList<String> getMaze(int currentRow, int currentCol, int endRow, int endCol) {
        // Positive Base Case: if you reach the end of the grid
        if (currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        // Negative Base Case
        if (currentRow > endRow || currentCol > endCol) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> result = new ArrayList<>();

        // Move one step vertically
        ArrayList<String> verticalResult = getMaze(currentRow + 1, currentCol, endRow, endCol);
        for (String temp : verticalResult) {
            result.add("V" + temp);
        }

        // Move one step horizontally
        ArrayList<String> horizontalResult = getMaze(currentRow, currentCol + 1, endRow, endCol);
        for (String temp : horizontalResult) {
            result.add("H" + temp);
        }

        // Move one step diagonally
        ArrayList<String> diagonalResult = getMaze(currentRow + 1, currentCol + 1, endRow, endCol);
        for (String temp : diagonalResult) {
            result.add("D" + temp);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> res = getMaze(0, 0, 2, 2);
        System.out.println(res);
    }
}
