package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class StackusingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackusingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

    }
    public void push(int x){
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return queue1.remove();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }

    public int size(){
        return queue1.size();
    }


    public static void main(String[] args) {
        StackusingQueue stack  = new StackusingQueue();
        stack.push(10);
        stack.push(30);
        System.out.println("First Size : " + stack.size());
        stack.pop();
        System.out.println("New Size : "+ stack.size());
    }
    
}
