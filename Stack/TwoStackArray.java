package Stack;

public class TwoStackArray {
    int [] arr;
    int capacity;
    int top1,top2;

    TwoStackArray(int capacity){      //Constructor 
        this.capacity = capacity;
        arr= new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    void push1(int x){
        if(top1 < top2-1){
            top1++;
            arr[top1] = x;
        }
        else{
            throw new RuntimeException("Stack Overflow");
        }
    }
    void push2(int x){
        if(top1 < top2-1){
            top2--;
            arr[top2] = x;
        }
        else{
            throw new RuntimeException("Stack Overflow");
        }
    }

    int pop1(){
        if(top1>0){
            int x = arr[top1];
            top1--;
            return x;
        }
        else{
            throw new RuntimeException("Stack Overflow");
        }
    }
    int pop2(){
        if(top2<capacity){
            int x = arr[top2];
            top2++;
            return x;
        }
        else{
            throw new RuntimeException("Stack Overflow");
        }
    }
    int peek1(){
        if(top1>=0){
            int x = arr[top1];
            return x;
        }
        else{
            throw new RuntimeException("Stack1 Underflow");
        }
    }
    int peek2(){
        if(top2< capacity){
            int x = arr[top2];
            return x;
        }
        else{
            throw new RuntimeException("Stack1 Underflow");
        }
    }
    int size1(){
        return top1+1;
    }
    int size2(){
        return capacity - top2;
    }
    boolean isEmpty1(){
        return top1==-1;
    }
    boolean isEmpty2(){
        return top2==capacity;
    }

    public static void main(String[] args) {


        

    }
    
}
