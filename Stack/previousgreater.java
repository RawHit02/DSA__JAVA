package Stack;

import java.util.Stack;

public class previousgreater {
    static int[] func2(int [] prices){
        int n  = prices.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : prices[stack.peek()];
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int prices[] = {60,70,30,85,40,90};
        int[] ans = func2(prices);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    
}
