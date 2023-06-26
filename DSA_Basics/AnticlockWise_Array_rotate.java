public class AnticlockWise_Array_rotate {

    public static void Anticlockwise(int [] arr){
        System.out.println("original array is :");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int temp = arr[0];
        for(int i = 1 ; i<=arr.length-1 ;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]= temp;
    }

    //Two Pointer Approach
    static void rotateOnceP2(int arr[]){
        int i=0;
        int j = arr.length-1;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i]= arr[j];
            arr[j] =temp;
            i++;
        }
    }



    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};
        //Anticlockwise(arr);
        rotateOnceP2(arr);
        System.out.println();
        System.out.println("AntiClockwise array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

