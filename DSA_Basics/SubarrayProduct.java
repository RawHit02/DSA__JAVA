public class SubarrayProduct {

    static int solution(int arr[] , int k){
        int ans =0;
        int product =1;
        int start =0;
        for(int i =0 ;i<arr.length;i++){
            //including the next element in product
            product = product * arr[i];
            while(product >=k){
                //removing the first element of Subarray from product 
                product = product / arr[start++];

            }
            ans +=i-start +1;
            System.out.print(product);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,2,6};
        int k = 100;
        int ans = solution(arr,k);
        System.out.print(ans);
    }
    
}
