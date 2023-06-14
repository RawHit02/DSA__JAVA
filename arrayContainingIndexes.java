// import java.util.ArrayList;
// import java.util.List;
public class arrayContainingIndexes {
    
//     public static List<Integer> search(int[] arr, int index, int num) {
//         List<Integer> indexes = new ArrayList<>();

//         if (index == arr.length) {
//             return indexes;
//         }
//         if (arr[index] == num) {
//             indexes.add(index);
//         }
//         indexes.addAll(search(arr, index + 1, num));
//         return indexes;
// }

static int[] searchIndex(int arr[] , int index , int search , int count){
    
    if(index ==(arr.length-1)){

        int a[] = new int[count];
        return a;
    }
    int arr_1[] = null;

    if(arr[index]== search){
        arr_1 = searchIndex(arr,index+1,search , count+1);
    }
    else{
        arr_1 = searchIndex(arr , index+1, search , count);
    }
    if(arr[index]==search){
        arr_1[count]=index;
    }
    return arr_1;
}
    public static void main(String[] args) {
        // int arr[] = { 20, 5, 6, 0, 5, 9, 5 };
        // int num = 5;
        // List<Integer> indexes = search(arr, 0 , num);
        // System.out.println(indexes);

    int arr[] = { 20, 3, 6, 0,3,8,2};
        int search = 9;
        int element = 3;
        int output[] = searchIndex(arr,0,search,0);
        for(int i=0 ; i< output.length ; i++){
            System.out.println(output[i]);
        }
    }
}
