import java.util.HashMap;
// public class Count_Distinct_Elements {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 4, 6, 6, 7, 7};
//         int k = 4;
import java.util.Map;


//         int[] result = countDistinctElements(arr, k);
//         for (int count : result) {
//             System.out.print(count + " ");
//         }
//     }

//     public static int[] countDistinctElements(int[] arr, int k) {
//         int n = arr.length;
//         int[] result = new int[n - k + 1];

//         HashMap<Integer, Integer> countMap = new HashMap<>();
//         int distinctCount = 0;

//         // Count distinct elements in the first window
//         for (int i = 0; i < k; i++) {
//             countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
//             if (countMap.get(arr[i]) == 1) {
//                 distinctCount++;
//             }
//         }

//         result[0] = distinctCount;

//         // Slide the window and update distinct count for each window
//         for (int i = k; i < n; i++) {
//             // Remove the leftmost element from the window
//             int leftElem = arr[i - k];
//             countMap.put(leftElem, countMap.get(leftElem) - 1);
//             if (countMap.get(leftElem) == 0) {
//                 distinctCount--;
//             }

//             // Add the rightmost element to the window
//             int rightElem = arr[i];
//             countMap.put(rightElem, countMap.getOrDefault(rightElem, 0) + 1);
//             if (countMap.get(rightElem) == 1) {
//                 distinctCount++;
//             }

//             result[i - k + 1] = distinctCount;
//         }

//         return result;
//     }
// }

class Count_Distinct_Elements{   public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,6,6,7,7};
        int slide = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i + slide - 1 < arr.length; i++) {
            map = new HashMap<>();
            int k = 0;
            int j = i;
            while(k < slide) {
                if(map.get(arr[j]) == null) {
                    map.put(arr[j], 1);
                }
                else {
                    int f = map.get(arr[j]) + 1;
                    map.put(arr[j], f);
                }
                j++;
                k++;
            }
            System.out.println(map);
            int count = 0;
            for(Map.Entry<Integer, Integer> e : map.entrySet()) {
                count++;
                // if(e.getValue() == 1) {
                //     count++;
                // }
            }
            System.out.println(count);
        }
    }
}