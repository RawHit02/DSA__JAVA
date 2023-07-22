package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FindDigitNotMatch {
    static int func(int arr1[] , int arr2[]){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        //Arr1 to stack
        for(int i=0;i<arr1.length;i++){
            stack.push(arr1[i]);            
        }
        //Arr2 to queue
        for(int i=0;i<arr2.length;i++){
            queue.offer(arr2[i]);
        }
        int digits =0;
        while(true){
            if(stack.peek()== queue.peek()){
                digits = 0;
                stack.pop();
                queue.poll();
        }
        else{
            digits++;
            queue.offer(queue.poll());
        }
        if(digits == queue.size()){
            break;
        }
    }
    return digits;
}
    public static void main(String[] args) {
        int arr1[] = {1,0,1,1};
        int arr2[] = {1,0,1,1};
        int ans = func(arr1,arr2);
        System.out.println(ans);
    }
    
}
