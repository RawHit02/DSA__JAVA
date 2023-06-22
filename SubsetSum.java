public class SubsetSum {
    private static int arr;
    static boolean isSubsetSum(int N , int arr[] , int sum){
        if(sum==0){
            return true;
        }
        if(N==0){
            return false;
        }
        if(arr[N-1]<=sum){
            //INCLUDE THE SUM
            return isSubsetSum(N-1,arr,sum-arr[N-1]) || isSubsetSum(N-1,arr,sum);
        }
        else{
            //EXCLUDE THE SUM
            return isSubsetSum(N-1,arr,sum);
        }
    }
    public static void main(String[] args) {
       int[] arr = {3,4,2,9,2};
       int sum = 8;
       int N = arr.length;
       boolean result = isSubsetSum(N,arr,sum);
       System.out.println(result);
    }
}