public class Subarray_sum {

     static void approach_2(int arr[],int sum){
        int currentsum = 0;
        int startindex = 0;
        //sum of first k elements
        for(int i=0;i<arr.length;i++){
            currentsum += arr[i];
            while(currentsum>sum){
                currentsum -= arr[startindex];
                startindex++;
            }
            if(currentsum == sum){
                for(int j=startindex;j<=i;j++){
                    System.out.print(arr[j]+ " ");
            }
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int sum =90;
        approach_2(arr,sum);
    }
    
}
