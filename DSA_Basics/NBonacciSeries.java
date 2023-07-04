// public class NBonacciSeries{
//     public static void main(String[] args) {
//         int n = 3;
//         int nthTerm = 15;

//         int[] result = NBonacci(n, nthTerm);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }

//     public static int[] NBonacci(int n, int nthTerm) {
//         if (n < 2) {
//             System.out.println("Invalid value of n. n should be greater than or equal to 2.");
//             return new int[0];
//         }

//         int[] series = new int[nthTerm];
//         series[n - 1] = 1;

//         for (int i = n; i < nthTerm; i++) {
//             int sum = 0;
//             for (int j = i - n; j < i; j++) {
//                 sum += series[j];
//             }
//             series[i] = sum;
//         }

//         return series;
//     }
// }

// public class NBonacciSeries {
//     public static void main(String[] args) {
//         int n = 3;
//         int nthTerm = 15;

//         int[] result = NBonacci(n, nthTerm);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }

//     public static int[] NBonacci(int n, int nthTerm) {
//         if (n < 2) {
//             System.out.println("Invalid value of n. n should be greater than or equal to 2.");
//             return new int[0];
//         }

//         int[] series = new int[nthTerm];
//         series[n - 1] = 1;

//         int sum = 0;
//         for (int i = 0; i < nthTerm; i++) {
//             if (i < n) {
//                 sum += series[i];
//             } else {
//                 sum += series[i] - series[i - n];
//             }
//             series[i] = sum;
//         }

//         return series;
//     }
// }


public class NBonacciSeries {
    public static void main(String[] args) {
        int slide = 3;
        int nterm =15;
        int arr[] = new int[nterm];
        for(int i=0;i<slide-1;i++){
            arr[i]=0;
        }
        arr[slide-1]=1;
        int start =-1;
        int second = 0;
        for(int i=slide ; i<arr.length-1;i++){
            if(start != -1){
                second = arr[i-1] -arr[start];
                arr[i] = arr[i-1]+ second;
            }
            else{
                arr[i] =arr[i-1];
            }
            start++;
        }
        int n = arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }

}