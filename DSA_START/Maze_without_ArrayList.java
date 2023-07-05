
public class Maze_without_ArrayList{

 static void printMaze(int currentRow, int endRow, int currentCol, int endCol, String output) {
        if(currentRow == endRow && currentCol == endCol) {
            System.out.println(output);
            return;
        }
        if(currentRow > endRow || currentCol > endCol) {
            return;
        }
        printMaze(currentRow + 1, endRow, currentCol, endCol, output + "V");
        printMaze(currentRow, endRow, currentCol+1, endCol, output + "H");
       
        //For Addition of Diagonal we have to implement this 
        // printMaze(currentRow+1,endRow,currentCol+1,endCol,output+"D");
    }

    public static void main(String[] args) {
        printMaze(0, 2, 0, 2, "");
    }
}