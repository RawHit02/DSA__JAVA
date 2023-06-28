public class removeDuplicate {
    static int duplicateremove(int [] arr){
        int l = 1;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[l]=arr[i];
                l+=1;
            }
        }
        return l;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5};
        int length = duplicateremove(arr);

        System.out.println("New Length: " + length);
        System.out.print("Array without Duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
