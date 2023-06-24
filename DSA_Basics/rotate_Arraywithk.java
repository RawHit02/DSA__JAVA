public class rotate_Arraywithk {
    public static void  rotate(int[]arr  , int k){
        int count = 1;
        while(count<=k){
            rotate1(arr);
            count++;    
        }
    }

    public static void rotate1(int []arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
}

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k =3;
        rotate(arr,k);
        for(int num: arr){
            System.out.println(num + " ");
        }
    }
}
