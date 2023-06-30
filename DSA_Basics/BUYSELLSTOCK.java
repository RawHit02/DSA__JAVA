public class BUYSELLSTOCK {

    static void approach_1(int nums[]){
        int n=nums.length;
        int first = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(max < nums[j] - nums[i]){
                    max = nums[j] - nums[i];
                    first = nums[i];
                    last =nums[j];
                }
            }
        }
        System.out.println(last + " " + first ); // as the elements in the first is 1 and in last is 6 so the diffrence is the maximum value of the stock one can get after buying 
    }

    static void approach_2(int arr[]){
        int n =arr.length;
        int profit = 0;
        int finalProfit =0;
       
        int prefixMin[] = new int[n];
        prefixMin[0] = arr[0]; //the new arayprefixMin get the first element in the arr 
        for(int i=1; i<n ; i++){
            prefixMin[i] = Math.min(prefixMin[i-1],arr[i]); // put all the min elements from prefix min to the prefixMin array
        //prefixmin[i] = (7,1) prefixmin[] = 1 coz 1 is min then 7
        }
        
        for(int i=1;i<n;i++){
            finalProfit = (arr[i] - prefixMin[i]); // 1-1 , 5-1 , 3-1 , 6-1, 4-1
            profit = Math.max(finalProfit,profit);
        }
        System.out.println(profit);
    }

    static void approach_3(int arr[]){
        int n = arr.length;
        int profit = 0;
        int finalProfit = 0;
        int min = arr[0];
        for(int i=1;i<n;i++){
            finalProfit = arr[i] - min;
            profit = Math.max(finalProfit , profit);
            min = Math.min(min,arr[i]);
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        approach_1(nums);
        approach_2(nums);
        approach_3(nums);
    }
    
}
