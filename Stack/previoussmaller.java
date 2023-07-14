package Stack;

import java.util.Stack;

public class previoussmaller {
    static int[] func2(int [] prices){
        int n  = prices.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : prices[stack.peek()];
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int prices[] = { 10,20,30,15,65,90,70};
        int[] ans = func2(prices);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    
}
