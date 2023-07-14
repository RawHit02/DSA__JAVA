package Stack;

import java.util.ArrayList;

import Stack.stackwitharray.MyStack;

public class stackwithAL{

    //Stack Implementation using ArrayList

    private ArrayList<Integer> stack;

    public stackwithAL(){
        stack = new ArrayList<>();
    }

    public void push(int x){
        stack.add(x);
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        
        int lastindex = stack.size()-1;
        return stack.remove(lastindex); 
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Emp");

        }
        int lastindex = stack.size()-1;
        return stack.get(lastindex);
    }

    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
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
