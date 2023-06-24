import java.util.*;
public class find_Pair_Sum {
    public static void find(int [] arr ,int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                System.out.println("pair found "+ arr[left] + " " + arr[right]);
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
    

    public static void main(String[] args) {
        int [] arr = {2,4,5,1,9,8};
        int target = 10;
        find(arr,target);
    }
}
