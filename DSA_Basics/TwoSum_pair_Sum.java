import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_pair_Sum {

    static void approach_1(int [] arr , int target){
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1 ; j<arr.length-1 ; j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println("pair is " + i +", " + j);
                    return;
                }
            }
        }
    }

    static void approach_2(int arr[] , int target){
        //TC : O(n)
        //SC : O(n)

        HashMap<Integer,Integer> Map = new HashMap<>();//Initially map is empty
        for(int e:arr){ //This for each loop check the value in arr through e
            if(Map.get(e)==null){ //if Map does not contain the value of the array(e) in it
                Map.put(target-e,e);} // then put the key and value in the map 
            //Note : the map is only storing the key in it so that if the key once repeated ion the Map it will return the previous key value 
            else{
                System.out.println(Map.get(e)+" "+e);
                break;
            }
        }
    }
    static void Optimize(int arr[] , int target)
    {
        Arrays.sort(arr);
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println("Pair is "+ arr[i] + " "+ arr[j]);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,5,3,7,6,2,9};
        //approach_1(arr,9);
        //approach_2(arr,12);
        Optimize(arr,12);
    }
    
}
