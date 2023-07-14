package Stack;

import java.util.Stack;

public class pricessell{

    static int[] function(int[] prices){
        int n = prices.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int j = i+1;
            while(j<n && prices[i]<= prices[j]){
                j++;
            }
            ans[i] = (j<n)?prices[j]:-1;
        }
        return ans;
    }


 static int[] func1(int [] prices){
        int n  = prices.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : prices[stack.peek()];
            stack.push(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // int prices[] = {16,15,8,7,9};
        // int [] ans = function(prices);
        // for(int i:ans){
        //     System.out.print(i+" ");
        // }
        int prices[] = {16,15,8,7,9};
        int [] ans = func1(prices);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}