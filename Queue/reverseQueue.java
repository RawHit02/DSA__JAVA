package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class reverseQueue {

    static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(30);
        queue.add(80);
        queue.add(40);
        System.out.println("Original Queue :" + queue);
        reverseQueue(queue);
        System.out.println("reverse Queue :" + queue);
    }
    
}

    