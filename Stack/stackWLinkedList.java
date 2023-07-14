package Stack;
 
import java.util.LinkedList;
public class stackWLinkedList {

    private LinkedList<Integer> stack;

    public stackWLinkedList(){
        stack = new LinkedList<>();
    }

    public void push(int x){
        stack.addLast(x);
        System.out.println("Element added : " + x  );
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        return stack.removeLast(); 
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Emp");
        }
        return stack.getLast();
    }
    public int size(){
        return stack.size();
    }
    public static void main(String[] args) {
        stackWLinkedList stack = new stackWLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size()); System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}