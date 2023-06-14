public class isArraySorted {
    static boolean isSorted(int arr[], int index){
        //Terminating condition
        if(arr.length-1 == index){
            return true;
        }
        if(arr[index]> arr[index+1]){
            return false;
        }
        //Small problem
        return isSorted(arr,index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,22,7,8,9,10};
        System.out.println(isSorted(arr,0));

    }
}
