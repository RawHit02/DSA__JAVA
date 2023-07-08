package Linked_List;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LLdemo {
    public static void main(String[] args) {
        Node n1 = new Node(100);
        Node n2 = new Node(20);
        Node n3 = new Node(80);
        n1.next = n2;
        n2.next=n3;
        n3.next = new Node(90);
        n3.next.next = new Node(200);

        Node start =n1;
        while(start!=null){
            System.out.println(start.data+",");
            start = start.next;
        }
    }
}
