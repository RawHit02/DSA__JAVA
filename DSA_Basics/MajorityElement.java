import java.util.HashMap;
import java.util.Map;

public class MajorityElement{

    //  static int approach_1(int arr[],int n){
    //     int majorityCount = n/2;
    //     for(int num: arr){
    //         int count =0;
    //         for(int elem : arr){
    //             if(elem==num){
    //                 count +=1;
    //             }
    //         }
    //         if(count > majorityCount){
    //             return num;
    //         }
    //     }
    //     return -1;
    // }
    

    
    //Using Hash Map
    //Approach2
    
     static void approach_2(int arr[], int n) {
        int majorityCount = n / 2;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
        countMap.put(num, countMap.containsKey(num) ? countMap.get(num) + 1 : 1);
            if (countMap.get(num) > majorityCount) {
                System.out.print(num);
                break;
            }
        }
    }

    
    // static int approach_3(int arr[] , int n){
    //         int count =0;
    //         int majorityElement = 0;
    //         for(int i=0;i<n ;i++){
    //             if(count==0){
    //                 majorityElement = arr[i];
    //             }
    //             if(majorityElement == arr[i]){
    //                 count++;
    //             }
    //             else{
    //                 count--;
    //             }
    //         }
    //         count =0;
    //         for(int i=0;i<n;i++){
    //             if(arr[i] == majorityElement){
    //                 count++;
    //             }
    //         }
    //         int ans = count> n/2 ?majorityElement : -1;
    //         return ans;

    //     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,1,1,2,2,2,2};
        int n = arr.length;
        // approach_1(arr,n);
        approach_2(arr,n);
        // approach_3(arr,n);
    }
}