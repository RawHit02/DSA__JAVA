public class sort_0_1 {
    
    static void sort(int arr[]){
        int count =0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                count++;
            }
        }
        
        //Fill the array with 0
        for(int j=0;j<count;j++){
            arr[j] =0;
        }

        //Fill remaining with 1
        for(int k=count ; k<arr.length-1;k++){
            arr[k] =1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,1,0,1,0,0,1,0,1,1,1};
        sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
