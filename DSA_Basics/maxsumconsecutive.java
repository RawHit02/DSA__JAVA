public class maxsumconsecutive {
    
    static void approach_1(int[] arr, int k){

        int maxsum = 0;
        for(int i=0;i+k-1<arr.length;i++){
            int sum =0;
            for(int j = 0; j<k; j++){
                sum += arr[i+j];
            }
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        System.out.println("Maximum sum "+ maxsum);
    }

    static void approach_2(int arr[],int k){
        int slidesum = 0;
        int maxsum = 0;

        //sum of first k elements
        for(int i=0;i<k;i++){
            slidesum = slidesum + arr[i];
        }
        maxsum = slidesum;
        for(int i=k;i<arr.length;i++){
            slidesum = slidesum + arr[i]- arr[i-k];
            if(slidesum > maxsum){
                maxsum = slidesum;
            }
           
        }
        System.out.println(maxsum);
    }
    
    
    
    public static void main(String[] args) {
        int arr[] = {1,40,30,10,20,5};
        int k =3;
        approach_1(arr,k);
        approach_2(arr,k);
    }
}