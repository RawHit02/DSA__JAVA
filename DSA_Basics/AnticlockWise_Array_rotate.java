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



    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};
        Anticlockwise(arr);
        System.out.println();
        System.out.println("AntiClockwise array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

