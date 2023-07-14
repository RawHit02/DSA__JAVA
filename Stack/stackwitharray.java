package Stack;

public class stackwitharray {

    public static class MyStack{
        private int arr[]; // Attributes of class
        int capacity ;
        int top;
                    // About Constructors like below 
                    // Also note that the constructor is called when the object is created.
                    // All classes have constructors by default: if you do not create a class
                    // constructor yourself, Java creates one for you. However, then you are not
                    // able to set initial values for object attributes.
                    

        public MyStack(int c){ // Constructor 
            capacity  = c;       // setting the initial value for the class attributes
            arr = new int[capacity];
            top = -1;

        }

        public void push(int x){
            if(top == capacity-1){
                System.out.println("stack is full");
                return;
            }
            arr[++top] =x;
            System.out.println("Element inserted : " + arr[top]);
        }

        public int pop(){
            if(top==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }

        public int peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return -1;
            }
                return arr[top];
            }

        public int size(){
            return top+1;
        }
        public boolean isEmpty(){
            return (top==-1);
        }
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
    
}
