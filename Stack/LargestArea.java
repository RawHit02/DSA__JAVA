package Stack;

public class LargestArea {

    static int maxArea(int arr[]){
        int n = arr.length;
        int max =0;
        for(int i=0;i<n;i++){
            int ans = arr[i];
            for(int j = i-1;j>=0;j--){
                if(arr[j] >= arr[i]){
                    ans  += arr[i];
                }
                else{
                    break;
                }
            }

            for(int j= i+1;j<n;j++){
                if(arr[j] >= arr[i]){
                    ans  += arr[i];
                }
                else{
                    break;
                }
            }
            max = Math.max(max , ans);

        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,6};
        System.out.println("Maximum area is : " +  maxArea(arr));
    }
    
}
