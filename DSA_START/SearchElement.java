public class SearchElement {
    static int search(int arr[] , int index , int num){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index]==num){
            return index;
        }
        return search(arr,index+1,num);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int num = 3;
        int index = search(arr,0,num);
        System.out.println(index);
        }

}
