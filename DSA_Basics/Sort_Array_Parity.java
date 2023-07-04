public class Sort_Array_Parity {
    static void Array_Parity(int []arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            if(arr[start]%2==0){
                start++;
            }
            else{
                int temp=arr[start];
                arr[start]= arr[end];
                arr[end] = temp;
            }
            if(arr[end]%2!=0){
                end--;
            }
            else{
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
        }
        for(int arr1:arr){
        System.out.print(arr1 + " ");}
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        Array_Parity(arr);
    }
    
}
