public class pattern1 {
    static void printStar(int noOfStar){
        if(noOfStar == 0){
            return;
        }
        //processing logic
        System.out.print("*");
        printStar(noOfStar-1);
        //Small Problem
    }

    static void printPattern(int rows , int currentRow){
        if(rows==0){
            return;
        }
        printStar(currentRow);
        System.out.println();
        printPattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern(5,1);
    }
}
