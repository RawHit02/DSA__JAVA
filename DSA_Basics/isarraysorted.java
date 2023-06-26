public class isarraysorted {
    

    // static void sorted(int[] arr){
    //     int n = arr.length-1;
    //     for(int i=0;i<n ; i++){
    //         for(int j = i+1 ; j<n;j++){
    //             if(arr[i]>arr[j]){
    //                 System.out.println("array is not sorted");
    //                 return;
    //             }
    //             else{
    //                 System.out.println("array is sorted");return;}
    //         }
    //     }
    // }

    
    static void sorted2(int arr[]){
        int n = arr.length-1;
        for(int i=1;i<n;i++){
            if(arr[i-1] > arr[i]){
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }

    public static void main(String[] args) {
        int [] arr = {2 ,1,4,5,7,8,9};
        sorted2(arr);
    }
}
