import java.util.Arrays;

public class MissingNumber {
    static void missing(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int missingNumber = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1) { // if arr start or havig 0 in it then arr[i] != i
                missingNumber = i+1; // missingnum - i
                continue;
            }
        }

        // if (missingNumber == -1) {
        //     missingNumber = n; // Handles the case when the missing number is at the end of the array.
        // }

        System.out.println(missingNumber);
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5};
        missing(arr);
    }
}
