public class pattern6 {
    
    void printTriangle(int n) {
        // code her
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numRows = 5;
        pattern6 p = new pattern6();
        p.printTriangle(numRows);
    }
}
