public class  rotatearraybykOptimized{

    public static void reverse(int arr[] , int i , int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    int k=3;
    int n = arr.length-1;
    k = k%n;
    // reverse(arr,0,k);
    // reverse(arr,k+1,arr.length-1);
    // reverse(arr,0,arr.length-1);
    reverse(arr,0,n);
    reverse(arr,0,k-1);
    reverse(arr,k,n);

    for(int i:arr){
        System.out.print(i +  ", ");
    }
}
}
