public class sort_colorNumbers {
    static void sort(int arr[]){
        int count =0;
        int count1 =0;

        //Search how many zeros in arr
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else if(arr[i]==1){
                count1++;
            }
        }
    
        
        //Fill the array with 0
        for(int i=0;i<count;i++){
            arr[i] =0;
        }

        //Fill the arr with 1
        for(int i=count; i<count + count1;i++){
            arr[i] =1;
        }

        //Fill remaing with 2
        for(int i= count + count1;i<arr.length;i++){
            arr[i]=2;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}