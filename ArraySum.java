public class ArraySum {

    public static void inputarray(int inputArray[]) {
        int n = inputArray.length;
        int[] outputArray = new int[n];
        for (int i = 0; i < n; i++) {
            int num = inputArray[i];
            int digitSum = 0;
            while (num > 0) {
                digitSum = digitSum + num % 10;
                num /= 10;
            }
            outputArray[i] = digitSum;
        }
        for (int num : outputArray) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] inputArray = { 12, 34, 89, 76, 90 };
        inputarray(inputArray);

    }
}