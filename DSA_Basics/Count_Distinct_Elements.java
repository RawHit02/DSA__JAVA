import java.util.HashMap;
public class Count_Distinct_Elements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 6, 7, 7};
        int k = 4;

        int[] result = countDistinctElements(arr, k);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] countDistinctElements(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int distinctCount = 0;

        // Count distinct elements in the first window
        for (int i = 0; i < k; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
            if (countMap.get(arr[i]) == 1) {
                distinctCount++;
            }
        }

        result[0] = distinctCount;

        // Slide the window and update distinct count for each window
        for (int i = k; i < n; i++) {
            // Remove the leftmost element from the window
            int leftElem = arr[i - k];
            countMap.put(leftElem, countMap.get(leftElem) - 1);
            if (countMap.get(leftElem) == 0) {
                distinctCount--;
            }

            // Add the rightmost element to the window
            int rightElem = arr[i];
            countMap.put(rightElem, countMap.getOrDefault(rightElem, 0) + 1);
            if (countMap.get(rightElem) == 1) {
                distinctCount++;
            }

            result[i - k + 1] = distinctCount;
        }

        return result;
    }
}


