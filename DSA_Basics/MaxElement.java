import java.lang.reflect.Array;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class MaxElement {

//This is the NAIVE Approach

//     static void max(int arr[]){
//         int n = arr.length;
//         boolean isMax;
//         for(int i=0;i<n;i++){
//             isMax = true; // here we are supposing that the array first element is the greatest element
//             for(int j=0;j<n;j++)
//                 if(arr[j]>arr[i]){
//                     //found a greater element than current element
//                     isMax = false;
//                     break;
//                 }
//         if(isMax)//If isMax == true
//         {
//             System.out.println("Max Element is :" + arr[i]);
//             return;
//         }
//     }
// }
// static void max2(int [] arr){
//     int start =0;
//     int end = arr.length-1;
//     int max=0;
//     while(start<end){
//         if(arr[start] < arr[end]){
//             max = arr[end];
//         }
//         end--;
//     }
//     System.out.println(max);
// }

//Optimized way

static void max3(int [] arr){
    int max = arr[0];
    for(int i=arr.length-1 ; i<=0 ; i--)
    {
        if(max < arr[i]){
            max = arr[i];
        }
    }
    System.out.println(max);
    
}

    public static void main(String[] args) {
        int [] arr = {2100,2000,3,902,66,11,44};
        max3(arr);
    }
}
