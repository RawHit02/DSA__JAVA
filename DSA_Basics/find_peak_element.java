public class find_peak_element {

    static void peak(int [] arr){
    int start = 0;
    int end = arr.length-1;
    while(start < end){
        int mid = start + (end-start)/2;
        if(arr[mid]<arr[mid+1]){
            start = mid+1;
        }
        else{
            end = mid;
        }
    }
    System.out.println(start);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        peak(arr);
    }
}
