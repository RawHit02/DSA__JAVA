package Stack;

import java.util.Stack;

// Using Iterative Approach 
public class StockBuySell {
    static int[] function(int[] prices){
        int n = prices.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int c =1;
            int j = i-1;
            while(j>=0 && prices[j]<= prices[i]){
                c++;
                j--;
            }
            ans[i]=c;
        }
        return ans;
    }

    // Using Stack

    static int[] func2(int [] prices){
        int n  = prices.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? i+1 : i-stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        // int prices[] = {60,50,40,85,90,60};
        // int [] ans = function(prices);
        // for(int i:ans){
        //     System.out.print(i+" ");
        // }
        int prices[] = {60,50,40,85,90,60};
        int [] ans = func2(prices);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
