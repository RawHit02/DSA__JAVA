public class ArraySubtraction{
    public static void main(String[] args) {
        int arr1[] = {9,1,8,9};
        int arr2[] = {1,0,2,7};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1>n2 ? n1:n2;
        int result[] = new int[n3];
        int diff = 0;
        int borrow =0;
        int i = n1-1;
        int j = n2-1;
        int k= n3-1;

        while(k>=0){
            if(i>=0 && j>=0){
                diff = arr1[i] - arr2[j] - borrow;
            }
            else if(i>=0 && j<0){
                diff = arr1[i] - borrow;

            }
            else if(i<0 && j>=0){
                diff = arr2[i] - borrow;
            }
            if(diff <0){
                diff+=10;
                borrow=1;
            }
            else{
                borrow=0;
            }
        
            result[k] = diff;
            i--;
            j--;
            k--;
        }
        int startIndex = 0;
        while (startIndex < n3 - 1 && result[startIndex] == 0) {
            startIndex++;
        }

        System.out.print("Result: ");
        if (startIndex == n3) {
            System.out.print("0");
        } else {
            for (int l = startIndex; l < n3; l++) {
                System.out.print(result[l] + " ");
            }
        }

    }
}
