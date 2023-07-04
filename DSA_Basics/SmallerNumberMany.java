import java.util.HashMap;
import java.util.Arrays;
public class SmallerNumberMany {
    public static void bruteforce(int arr[]){
        int n = arr.length;
        int[] output = new int[n];
        for(int i =0;i<n;i++){
           int count=0;
            for(int j = 0 ; j<n;j++){
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

    static void approach_3(int arr[]){
        int n = arr.length;
        int hash[] = new int[100];
        int output[] = new int[n];
        for(int i=0;i<arr.length;i++){
            if(hash[arr[i]]==0){
                hash[arr[i]]=1;
            }
            else{
                hash[arr[i]]+=1;
            }
        }
        //prefix sum array
        for(int  i=1;i<hash.length;i++){
            int prev = hash[i-1];
            int curr =hash[i];
            hash[i] = prev + curr;
        }
        // for(int i: hash){
        //     System.out.println(i+ ",");
        // }

        for(int i=0;i<arr.length;i++){
            output[i] = hash[arr[i]-1];
        }
        System.out.println();
        for(int i:output){
            System.out.print(i + ",");
        }
    }
    public static void main(String[] args) {
        int arr []= {8,1,2,3,4};
        bruteforce(arr);
        // approach_2(arr);
        System.out.println();
        approach_3(arr);
    }
}
