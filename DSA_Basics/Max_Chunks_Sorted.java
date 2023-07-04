public class Max_Chunks_Sorted {
    static void maxChunksToSorted(int[] arr) {    
        int [] prefixMax = new int[arr.length];
        int maxVal = Integer.MIN_VALUE;
        int chunks =0;
        for(int i=0;i<arr.length;i++){            
            maxVal = Math.max(maxVal,arr[i]);
            prefixMax[i]= maxVal;
            if(prefixMax[i] == i){
                chunks++;                                
            }
        }
        System.out.println(chunks);
}
public static void main(String[] args) {
    int arr[] = {1,2,0,4,4,5};
    maxChunksToSorted(arr);
    }

}
