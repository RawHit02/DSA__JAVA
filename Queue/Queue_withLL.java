package Queue;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Queue_withLL {

    Node front;
    Node rear;

    public Queue_withLL(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    int size =0;
    public void enqueue(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            size++;
        }
        else{
            rear.next = newNode;
            rear = newNode;
            size++;
        }
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new RuntimeException("Enqueue is Empty......");
        }

        int x = front.data;
        front = front.next;
        size--;
        System.out.println("Deleted Element is  : ");
        return x;
    }

    public int size(){
        return size;

    }
    public int getFrontValue() throws Exception{
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return front.data;
    }

    public int getrearValue() throws Exception{
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return rear.data;
    }




    public static void main(String[] args) throws Exception {
        Queue_withLL queue = new  Queue_withLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);


        System.out.println(queue.getFrontValue());
        System.out.println(queue.getrearValue());
        System.out.println(queue.size());
        System.out.println();
    }
    
}
