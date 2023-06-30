import java.util.HashMap;
import java.util.Arrays;
public class SmallerNumberMany {
    public static void bruteforce(int arr[]){
        int n = arr.length;
        int count =0;
        int[] output = new int[n];
        for(int i =0;i<arr.length;i++){
            count=0;
            for(int j = 0 ; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
            output[i] = count;
        }
         for(int i : output ){
            System.out.print(i + ",");
        } 
    }

    //Approach - 2 (USE Sorting ) : TC
    public static void approach_2(int arr[]){
       
        int n = arr.length;
        // [8,1,2,2,3]
        int org[] = arr.clone(); // keep the clone in org variable
        Arrays.sort(arr); //[1,2,2,3,8]
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
        map.put(arr[i], i);}
        int output[] = new int[n];
        for(int i=0;i<org.length;i++){
            output[i] = map.get(org[i]);
        }
          System.out.println();
        for(int i:output){
          
            System.out.print(i + ",");
        }
    }
    public static void main(String[] args) {
        int arr []= {8,1,2,3,4};
        bruteforce(arr);
        approach_2(arr);
    }
}
