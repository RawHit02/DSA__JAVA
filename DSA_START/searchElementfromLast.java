public class searchElementfromLast {
    static int search(int arr[], int index, int num) {

        if (index < 0) {
            return -1;
        }
        if (arr[index] == num) {
            return index;
            //return arr.length-1-index;
        }
        return search(arr, index-1, num);
    }

    public static void main(String[] args) {
        int arr[] = { 20,90,1,90,6 };
        int num = 90;
        int i = arr.length-1;
        int index = search(arr, i, num);
        System.out.println(index);
    }
    
}
